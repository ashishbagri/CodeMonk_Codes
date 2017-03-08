package heap_and_prioritysort.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MonkAndMultiplication {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n =  sc.nextInt();
		int[] numbers = new int[3];
		for(int i =0 ;i<n ;i++){
			int num = Integer.parseInt(sc.next());
			if(i<2){
				System.out.println(-1);
				numbers[i] = num;
				continue;
			}
			if(i>=3){
				Arrays.sort(numbers);
				if(numbers[0]<num)
					numbers[0] = num;
				printSum(numbers);
				continue;
			}
			numbers[i] = num;
			printSum(numbers);
			
		}
	}

	private static void printSum(int[] numbers) {
		long sum = 1;
		for(int i =0;i <numbers.length;i++){
			sum*=numbers[i];
		}
		System.out.println(sum);
	}
	
}
