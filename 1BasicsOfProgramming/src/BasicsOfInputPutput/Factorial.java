package BasicsOfInputPutput;

import java.util.Scanner;

/**
 * You have been given a positive integer N N. You need to find and print the
 * Factorial of this number. The Factorial of a positive integer N N refers to
 * the product of all number in the range from 1 1 to N N. You can read more
 * about the factorial of a number here.
 * 
 * Input Format: The first and only line of the input contains a single integer
 * N N denoting the number whose factorial you need to find.
 * 
 * Output Format Output a single line denoting the factorial of the number N N.
 * 
 * Constraints 1 ≤ N ≤ 10 1≤N≤10
 * 
 * SAMPLE INPUT 2 SAMPLE OUTPUT 2 Time Limit: 1.0 sec(s) for each input file.
 * Memory Limit: 256 MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class Factorial {
	public static void main(String[] args) {
		int n = getInput();
		long factorial = 1;
		for (int i = 1; i <= n; i++)
			factorial *= i;
		System.out.println(factorial);
	}

	private static int getInput() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

}
