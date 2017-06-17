package BasicsOfInputPutput;

import java.util.Scanner;

/**
 * Dhananjay has recently learned about ASCII values.He is very fond of
 * experimenting. With his knowledge of ASCII values and character he has
 * developed a special word and named it Dhananjay's Magical word.
 * 
 * A word which consist of alphabets whose ASCII values is a prime number is an
 * Dhananjay's Magical word. An alphabet is Dhananjay's Magical alphabet if its
 * ASCII value is prime.
 * 
 * Dhananjay's nature is to boast about the things he know or have learnt about.
 * So just to defame his friends he gives few string to his friends and ask them
 * to convert it to Dhananjay's Magical word. None of his friends would like to
 * get insulted. Help them to convert the given strings to Dhananjay's Magical
 * Word.
 * 
 * Rules for converting:
 * 
 * 1.Each character should be replaced by the nearest Dhananjay's Magical
 * alphabet.
 * 
 * 2.If the character is equidistant with 2 Magical alphabets. The one with
 * lower ASCII value will be considered as its replacement.
 * 
 * Input format:
 * 
 * First line of input contains an integer T number of test cases. Each test
 * case contains an integer N (denoting the length of the string) and a string
 * S.
 * 
 * Output Format:
 * 
 * For each test case, print Dhananjay's Magical Word in a new line.
 * 
 * Constraints:
 * 
 * 1 <= T <= 100
 * 
 * 1 <= |S| <= 500
 * 
 * SAMPLE INPUT 1 6 AFREEN SAMPLE OUTPUT CGSCCO Explanation ASCII values of
 * alphabets in AFREEN are 65, 70, 82, 69 ,69 and 78 respectively which are
 * converted to CGSCCO with ASCII values 67, 71, 83, 67, 67, 79 respectively.
 * All such ASCII values are prime numbers.
 * 
 * Time Limit: 0.5 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class MagicalWord {

	private static int primes[] = {67,71,73,79,83,89,97,101,103,107,109,113};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			int n = Integer.parseInt(sc.next());
			String input = sc.next();
			char[] c = input.toCharArray();
			for(int i =0;i<c.length;i++){
				c[i] = findNearestPrimeChar(c[i]);
			}
			System.out.println(c);
		}
		
	}

	private static char findNearestPrimeChar(char c) {
		if(c<=67)
			return 67;
		if(c>=113)
			return 113;
		
		for(int j =0 ;j<primes.length;j++){
			
			if(primes[j]>c){
				int forward = primes[j]-c;
				int backward = c-primes[j-1];
				if(forward<backward)
					return (char) primes[j];
				return (char) primes[j-1];
			}
		}
		return 0;
	}

}
