package heap_and_prioritysort.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxInQueue {
	
	private static int index = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		long[] max_heap = new long[n+1];
		ArrayList<Long> list = new ArrayList<Long>();
		index = n;
		for(int i = 1;i<=n;i++){
			arr[i] = Long.parseLong(sc.next());
			list.add(arr[i]);
		}
		int q = Integer.parseInt(sc.next());
		while(q-->0){
			
			int first = Integer.parseInt(sc.next());
			if(first == 2){
				System.out.println(maximum(max_heap));
			}else{
				long second = Long.parseLong(sc.next());
				add(list,second);
			}
		}
	}

	private static long maximum(long[] arr) {
		// TODO Auto-generated method stub
		return arr[1];
	}

	private static void add(ArrayList<Long> list, long second) {
		//arr[index] = second;
		list.add(second);
		for(int i = index/2;i>=1;i--){
			max_heap(list,i,index);
		}
		index++;
		
		//index++;
	}

	private static void max_heap(ArrayList<Long> list, int i, int index) {
		
		int left = i*2;
		int right = i*2+1;
		
		int largest = i;
		
		if(left<=index&&list.get(left)>list.get(largest)){
			largest = left;
		}
		if(right<=index&&list.get(right)>list.get(largest)){
			largest = right;
		}
		
		if(largest!=i){
			swap(list,i,largest);
			max_heap(list, largest, index);
		}
	}

	private static void swap(ArrayList<Long> list, int i, int largest) {
		long temp =list.get(i);
		list.remove(i);
		list.add(i, list.get(largest));
		list.remove(largest);
		list.add(largest, temp);
	}
}
