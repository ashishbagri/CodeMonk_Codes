package BasicsOFBitManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Monk A loves to complete all his tasks just before the deadlines for
 * introducing unwanted thrill in his life. But, there is another Monk D who
 * hates this habit of Monk A and thinks it's risky.
 * 
 * To test Monk A, Monk D provided him tasks for N days in the form of an array
 * Array, where the elements of the array represent the number of tasks.
 * 
 * The number of tasks performed by Monk A on the ith day is the number of ones
 * in the binary representation of Arrayi.
 * 
 * Monk A is fed up of Monk D, so to irritate him even more, he decides to print
 * the tasks provided in non-decreasing order of the tasks performed by him on
 * each day. Help him out!
 * 
 * Input: The first line of input contains an integer T, where T is the number
 * of test cases. The first line of each test case contains N, where N is the
 * number of days. The second line of each test case contains Array array having
 * N elements, where Arrayi represents the number of tasks provided by Monk D to
 * Monk A on ith day.
 * 
 * Output: Print all the tasks provided to Monk A in the non-decreasing order of
 * number of tasks performed by him.
 * 
 * Constraints: 1 <= T <= 100 1 <= N <= 105 1 <= Arrayi <= 1018
 * 
 * Note: If two numbers have the same number of ones (set bits), print the one
 * which came first in the input first, and then the other one, as in the input.
 * 
 * SAMPLE INPUT 1 4 3 4 7 10 SAMPLE OUTPUT 4 3 10 7 Explanation In the sample
 * input, T = 1 and N = 4, where N is the number of days.
 * 
 * Tasks provided to Monk A on first day is 3 and binary representation of 3 is
 * { 11 }2, which contains 2 ones.
 * 
 * Tasks provided to Monk A on second day is 4 and binary representation of 4 is
 * { 100 }2, which contains 1 ones.
 * 
 * Tasks provided to Monk A on third day is 7 and binary representation of 7 is
 * { 111 }2, which contains 3 ones.
 * 
 * Tasks provided to Monk A on fourth day is 10 and binary representation of 10
 * is { 1010 }2, which contains 2 ones.
 * 
 * So the Output will be: 4 3 10 7
 * 
 * Time Limit: 1.0 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class MonkAndTasks {

	private static BufferedReader br = null;
	private static Map<Integer, StringBuilder> countMap;

	private static void init() {
		br = new BufferedReader(new InputStreamReader(System.in));

	}

	private static int getInt() {
		try {
			int n = Integer.parseInt(br.readLine());
			return n;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public static void main(String[] args) {
		init();
		int testcases = getInt();

		while (testcases-- > 0) {
			countMap = new TreeMap<Integer, StringBuilder>();
			int numbersLength = getInt();
			int[] numbers = getInputAray();

			populateCountsList(numbers);

			Set<Map.Entry<Integer, StringBuilder>> entrySet = countMap.entrySet();
			String result = "";
			for (Map.Entry<Integer, StringBuilder> entry : entrySet) {
				result += entry.getValue();
			}
			System.out.println(result.trim());
		}
	}

	private static int[] populateCountsList(int[] numbers) {
		int[] onesCount = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			onesCount[i] = countOnes(numbers[i]);

			if (countMap.get(onesCount[i]) == null)
				countMap.put(onesCount[i], new StringBuilder());
			countMap.get(onesCount[i]).append(numbers[i]).append(" ");
		}
		return onesCount;
	}

	private static int countOnes(int i) {
		int ones = 0;

		while (i > 0) {
			i = i & i - 1;
			ones++;
		}
		return ones;
	}

	private static int[] getInputAray() {
		String inputLine = getInputLine();
		String[] arraysInStringForm = inputLine.split(" ");
		int[] numbers = convertStringToIntArray(arraysInStringForm);
		return numbers;
	}

	private static int[] convertStringToIntArray(String[] arraysInStringForm) {

		int[] numbers = new int[arraysInStringForm.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arraysInStringForm[i]);
		}

		return numbers;
	}

	private static String getInputLine() {
		String inputLine = null;
		try {
			inputLine = br.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return inputLine;
	}
}
