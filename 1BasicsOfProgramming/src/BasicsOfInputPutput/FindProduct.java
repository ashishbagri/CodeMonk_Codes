package BasicsOfInputPutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have been given an array A A of size N N consisting of positive integers.
 * You need to find and print the product of all the number in this array Modulo
 * 10 9 + 7 109+7.
 * 
 * Input Format: The first line contains a single integer N N denoting the size
 * of the array. The next line contains N N space separated integers denoting
 * the elements of the array
 * 
 * Output Format: Print a single integer denoting the product of all the
 * elements of the array Modulo 10 9 + 7 109+7.
 * 
 * Constraints: 1 ≤ N ≤ 10 3 1≤N≤103 1 ≤ A [ i ] ≤ 10 3 1≤A[i]≤103
 * 
 * SAMPLE INPUT 5 1 2 3 4 5 SAMPLE OUTPUT 120 Explanation There are 5 5 integers
 * to multiply. Let's store the final answer in a n s w e r answer variable.
 * Since 1 1 is identity value for multiplication, initialize a n s w e r answer
 * as 1 1.
 * 
 * So the process goes as follows:
 * 
 * a n s w e r = 1 answer=1 a n s w e r = ( a n s w e r × 1 answer=(answer×1) %
 * ( 10 9 + 7 ) (109+7) a n s w e r = ( a n s w e r × 2 answer=(answer×2) % ( 10
 * 9 + 7 ) (109+7) a n s w e r = ( a n s w e r × 3 answer=(answer×3) % ( 10 9 +
 * 7 ) (109+7) a n s w e r = ( a n s w e r × 4 answer=(answer×4) % ( 10 9 + 7 )
 * (109+7) a n s w e r = ( a n s w e r × 5 answer=(answer×5) % ( 10 9 + 7 )
 * (109+7)
 * 
 * The above process will yield answer as 120 120
 * 
 * Time Limit: 1.0 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class FindProduct {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		long product = 1;
		for (int i = 0; i < n; i++) {
			product = product * Integer.parseInt(arr[i]) % 1000000007;
		}
		System.out.println(product);

	}
}
