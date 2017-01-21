package dayZero;

import java.util.Scanner;

public class GoodString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] charFreq = new int[26];
		int duplicates = 0;
		for (int i = 0; i < input.length(); i++) {

			charFreq[input.charAt(i) - 'a']++;
		}
		for(int i=0;i<26;i++){
			if(charFreq[i]>1)
				duplicates+=charFreq[i]-1;
		}
		System.out.println(duplicates);

	}
}
