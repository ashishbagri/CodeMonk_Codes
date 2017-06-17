package binarytrees;

import java.util.Scanner;
import java.util.TreeSet;

public class MonkandCursedTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Long> set = new TreeSet<Long>();
		
		for(int i =0;i<n;i++){
			set.add(Long.parseLong(sc.next()));
		}
		
		long first = Long.parseLong(sc.next());
		long second = Long.parseLong(sc.next());
		
		
	}
}
