package BasicsOFBitManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Gudi, a fun loving girl from the city of Dun, travels to Azkahar - a strange
 * land beyond the mountains. She arrives at the gates of Castle Grey, owned by
 * Puchi,the lord of Azkahar to claim the treasure that it guards. However,
 * destiny has other plans for her as she has to move through floors, crossing
 * obstacles on her way to reach the treasure. The gates of the castle are
 * closed. An integer N N is engraved on the gates. A writing on the wall says
 * 
 * Tap the gates as many times as there are unordered pairs of distinct integers
 * from 1 to N N whose bit-wise XOR does not exceed N N.
 * 
 * Help her find the number of the times she has to tap. Input: First line
 * contains an integer T T, T T testcases follow. Each testcase consists of an
 * integer N N.
 * 
 * Output: Print the answer to each testcase in a newline.
 * 
 * Constraints: 1 ≤ T ≤ 100 1≤T≤100 2 ≤ N ≤ 2000 2≤N≤2000
 * 
 * SAMPLE INPUT 3 4 6 8 SAMPLE OUTPUT 3 12 21 Explanation For N=4, pairs are
 * (1,2) , (1,3) and (2,3)
 * 
 * Time Limit: 2.0 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class TheCastleGate {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while (testCases-- > 0) {

			int n = Integer.parseInt(br.readLine());
			System.out.println(getTabs(n));
		}
	}

	private static int getTabs(int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++)
				if ((i ^ j) <= n)
					count++;
		}
		return count;
	}
}
