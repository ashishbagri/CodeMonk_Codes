package BasicsOFBitManipulations;

import java.util.Scanner;

public class Klass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mul = 2;
		for (int i = 1; i <= a; i++) {
			int x = ((int) (Math.pow(2, i) - 1));
			for (int j = 0; j <= a - i; j++) {
				System.out.print(x + " ");
				x = x * mul;
			}
		}
	}
}