import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

import java.util.*;
import java.math.*;
// insert additional imports here if needed

public class Solution {

    private int caclulationIntervalMillis;
    private Clock utcClock;
    private int privateMatchedVolume;
    private int publicMatchedVolume;
    private Map<Integer,Integer> q;

    public Solution(int caclulationIntervalMillis, Clock utcClock) {
        this.caclulationIntervalMillis = caclulationIntervalMillis;
        this.utcClock = utcClock;
        q = new LinkedHashMap(caclulationIntervalMillis) {
            protected boolean removeEldestEntry(Map.Entry eldest){
                return size() > caclulationIntervalMillis;
            }
        };
    }

    public void onPrivateTrade(int price, int size, long timestampMillis) {
        if(q.get(price)==null)
            privateMatchedVolume+=price*size;
        else{
            int existingVol = q.get(price)* price;
            int needed = price*size;
            if(existingVol>=needed){
                publicMatchedVolume+=existingVol-needed;
                q.put(price, (existingVol-needed)/price);
            }
        }

    }

    public void onPublicTrade(int price, int size, long timestampMillis) {
        if(q.get(price)== null)
            q.put(price, 0);
        int ex = q.get(price);
        q.put(price, ex+size);
    }

    public double calculateMissedVolumeFraction() {

        if(publicMatchedVolume ==0 || privateMatchedVolume ==0)
            return Double.NaN;

        return privateMatchedVolume/publicMatchedVolume;
    }

    // The rest of the class is the harness code. Please ignore it.

    private static final String FINISH_COMMAND = "finish";
    private static final String CALCULATE_CONSTANT = "calculate";
    private static final String PRIVATE_TRADE_COMMAND = "privateTrade";
    private static final String PUBLIC_TRADE_COMMAND = "publicTrade";
    private static final String INIT_COMMAND = "init";

    /**
     * Format:
     * init: "init\n<interval>\n"
     * on private trade:"privateTrade\n<clock_millis>\n<price>\n<size>\n<timestamp>\n"
     * on public trade:"publicTrade\n<clock_millis>\n<price>\n<size>\n<timestamp>\n"
     * calculate: "calculate\n<clock_millis>\n"
     * finish: "finish\n"
     */
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));) {

            TestClock clock = new TestClock(ZoneOffset.UTC);
            String initCommand = bufferedReader.readLine();
            assert initCommand.equals(INIT_COMMAND);
            int interval = Integer.parseInt(bufferedReader.readLine());

            Solution solution = new Solution(interval, clock);

            String command;
            int price;
            int size;
            long timestamp;
            do {
                command = bufferedReader.readLine();
                if (command.equals(PRIVATE_TRADE_COMMAND) || command.equals(PUBLIC_TRADE_COMMAND)) {
                    clock.currentMillis = Long.parseLong(bufferedReader.readLine());
                    price = Integer.parseInt(bufferedReader.readLine());
                    size = Integer.parseInt(bufferedReader.readLine());
                    timestamp = Long.parseLong(bufferedReader.readLine());
                    onTrade(command, solution, price, size, timestamp);
                } else if (command.equals(CALCULATE_CONSTANT)) {
                    clock.currentMillis = Long.parseLong(bufferedReader.readLine());
                    bufferedWriter.write(String.format("%.5f", solution.calculateMissedVolumeFraction()));
                    bufferedWriter.newLine();
                }
            } while (!command.equals(FINISH_COMMAND));
        }
    }


    private static void onTrade(String command, Solution solution, int price, int size, long timestamp) {
        if (command.equals(PRIVATE_TRADE_COMMAND)) {
            solution.onPrivateTrade(price, size, timestamp);
        } else {
            solution.onPublicTrade(price, size, timestamp);
        }

    }

    private static class TestClock extends Clock {

        private long currentMillis;
        private final ZoneId zone;

        private TestClock(ZoneId zone) {
            this.zone = zone;
        }

        @Override
        public ZoneId getZone() {
            return zone;
        }

        @Override
        public Clock withZone(ZoneId zone) {
            if (Objects.equals(this.zone, zone)) {
                return this;
            }
            return new TestClock(zone);
        }

        @Override
        public Instant instant() {
            return Instant.ofEpochMilli(millis());
        }

        @Override
        public long millis() {
            return currentMillis;
        }

    }
}
