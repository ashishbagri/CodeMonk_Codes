import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ZeroSum {

    public static void main(String[] args) throws IOException{
        new ZeroSum().solve(args);
    }

    private void solve(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            String in[] = br.readLine().split(" ");
            int count = 0;
            int sum = 0;
            Set<Integer> lookupTable = new HashSet<>();
            for (int i =0;i<n;i++){
                arr[i] = Integer.parseInt(in[i]);
                sum+=arr[i];
                if(sum==0 || !lookupTable.add(sum))
                    count++;
            }
            System.out.println(count);
        }
    }
}
