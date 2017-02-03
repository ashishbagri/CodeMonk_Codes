package BasicsOfInputPutput;

import java.util.Scanner;

/**
 * Your program is to use the brute-force approach in order to find the Answer
 * to Life, the Universe, and Everything. More precisely... rewrite small
 * numbers from input to output. Stop processing input after reading in the
 * number 42. All numbers at input are integers of one or two digits.
 * 
 * SAMPLE INPUT 1 2 88 42 99 SAMPLE OUTPUT 1 2 88 Time Limit: 5.0 sec(s) for all
 * input files combined. Memory Limit: 256 MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class LifeTheUniverseAndEverything {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 42) {
				break;
			}
			System.out.println(n);
		}
	}
}
