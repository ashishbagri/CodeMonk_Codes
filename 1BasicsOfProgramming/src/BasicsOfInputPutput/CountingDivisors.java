package BasicsOfInputPutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have been given 3 3 integers l l, r r and k k. Find how many numbers
 * between l l and r r (both inclusive) are divisible by k k. You do not need to
 * print these numbers, you just have to find their count.
 * 
 * Input Format The first and only line of input contains 3 space separated
 * integers l l, r r and k k.
 * 
 * Output Format Print the required answer on a single line.
 * 
 * Constraints 1 ≤ l ≤ r ≤ 1000 1≤l≤r≤1000 1 ≤ k ≤ 1000 1≤k≤1000
 * 
 * SAMPLE INPUT 1 10 1 SAMPLE OUTPUT 10 Time Limit: 1.0 sec(s) for each input
 * file. Memory Limit: 256 MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class CountingDivisors {
	public static void main(String[] args) {
		int[] input = getInputFromUser();
		int l = input[0];
		int r = input[1];
		int k = input[2];
		int count = 0;
		for (int i = l; i <= r; i++) {
			if (i % k == 0)
				count++;
		}
		System.out.println(count);
	}

	private static int[] getInputFromUser() {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = getInputFromUser(br);
		return input;
	}

	private static int[] getInputFromUser(BufferedReader br) {
		String inputLine = null;
		try {

			inputLine = br.readLine();
		} catch (IOException e) {

			throw new RuntimeException();
		}
		String[] inputArr = inputLine.split(" ");
		int numbers[] = new int[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			numbers[i] = Integer.parseInt(inputArr[i]);
		}
		return numbers;
	}
}
