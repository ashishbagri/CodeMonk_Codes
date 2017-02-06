package heap_and_prioritysort.practice;

import java.util.Scanner;

public class MaxInQueue {
	
	private static int index = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		long[] max_heap = new long[n+1];
		for(int i = 1;i<=n;i++){
			arr[i] = Long.parseLong(sc.next());
		}
		int q = Integer.parseInt(sc.next());
		while(q-->0){
			
			int first = Integer.parseInt(sc.next());
			if(first == 2){
				System.out.println(maximum(max_heap));
			}else{
				long second = Long.parseLong(sc.next());
				add(max_heap,second);
			}
		}
	}

	private static long maximum(long[] arr) {
		// TODO Auto-generated method stub
		return arr[1];
	}

	private static void add(long[] arr, long second) {
		arr[index] = second;
		for(int i = index/2;i>=1;i--){
			max_heap(arr,i,index);
		}
		index++;
	}

	private static void max_heap(long[] arr, int i, int index) {
		
		int left = i*2;
		int right = i*2+1;
		
		int largest = i;
		
		if(left<=index&&arr[left]>arr[largest]){
			largest = left;
		}
		if(right<=index&&arr[right]>arr[largest]){
			largest = right;
		}
		
		if(largest!=i){
			swap(arr,i,largest);
			max_heap(arr, largest, index);
		}
	}

	private static void swap(long[] arr, int i, int largest) {
		long temp =arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}
}
