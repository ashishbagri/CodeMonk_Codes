package BasicsOFBitManipulations;

import java.util.Scanner;

/**
 * The problem is straight and simple. Given a number X X ,find how many
 * positive A A ( A > 0 ) A>0) exists, such that 1. A A X X = A A + X X 2. A
 * A < < X X Input: The first line of the input will contain T T , the number of
 * test-cases. Next T T lines will contain integer X X . Output: For each
 * test-case , output the answer in a separate line.
 * 
 * 
 * @author PaRV
 *
 */
public class XorisMad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			int number = sc.nextInt();
			int count =0;
			for(int i=1;i<number;i++){
				if((number^i)==(number+i)){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
