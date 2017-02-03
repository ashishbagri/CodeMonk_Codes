package BasicsOfInputPutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have been given a String S S. You need to find and print whether this
 * string is a palindrome or not. If yes, print "YES" (without quotes), else
 * print "NO" (without quotes).
 * 
 * Input Format The first and only line of input contains the String S S. The
 * String shall consist of lowercase English alphabets only.
 * 
 * Output Format Print the required answer on a single line.
 * 
 * Constraints 1 ≤ | S | ≤ 100 1≤|S|≤100
 * 
 * Note String S S consists of lowercase English Alphabets only.
 * 
 * SAMPLE INPUT aba SAMPLE OUTPUT YES Time Limit: 1.0 sec(s) for each input
 * file. Memory Limit: 256 MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class PalindromeString {
	public static void main(String args[]) {
		String input = getInput();
		boolean isPalindrome = checkPalindrome(input);
		if (isPalindrome) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	private static String getInput() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			return input;
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	private static boolean checkPalindrome(String input) {
		boolean isPalindrome = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}