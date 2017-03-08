package heaps_and_prioritysort.concepts;

import java.util.Stack;

public class HeapSort {

	public static void main(String[] args) {
		new HeapSort().sort(new int[]{5,2,8,6,3,5,4,9,5,3});
	}
	public void sort(int[] numbers) {
		BinayHeap<Integer> binayHeap = new BinayHeap<Integer>(11);
		for (int i = 0; i < numbers.length; i++) {
			binayHeap.insert(numbers[i]);
		}
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i <numbers.length;i++){
			stack.push(binayHeap.delMax());
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}

	}
}
