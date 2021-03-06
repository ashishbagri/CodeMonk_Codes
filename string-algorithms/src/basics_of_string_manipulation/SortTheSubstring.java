package basics_of_string_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while (tests-- > 0) {
			String str = sc.next();
			int start = Integer.parseInt(sc.next());
			int last = Integer.parseInt(sc.next());

			String subString = str.substring(start, last + 1);
			System.out.println(subString);
			int[] arr = new int[subString.length()];
			for (int i = 0; i < subString.length(); i++) {
				arr[i] = subString.charAt(i);
			}
			Arrays.sort(arr);
			char[] sortedChar = new char[arr.length];
			for (int i = 0; i < arr.length; i++) {
				sortedChar[i] = (char) arr[arr.length - 1 - i];
			}
			System.out.println(str.replace(subString, new String(sortedChar)));
		}
	}
}
