package BasicsOFBitManipulations;

import java.util.Scanner;

/**
 * Given a number N, print the number of set bits in the binary representation
 * of this number.
 * 
 * Input: The first contains a single integer T denoting the number of test
 * cases. 
 * Each test case contains a single integer N 
 * Output: For each test case, 
 * print a single integer denoting the number of set bits in the binary
 * representation of the given N N .
 */
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int number = sc.nextInt();
			int count = 0;
			while(number>0){
				number = number & (number -1);
				count++;
			}
			System.out.println(count);
		}
	}
}
