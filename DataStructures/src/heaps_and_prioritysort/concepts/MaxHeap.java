package heaps_and_prioritysort.concepts;

public class MaxHeap {
	
	void max_heapify(int[] arr,int i, int n ){
		
		int left = 2*i;
		int right = 2*i+1;
		int largest = i;
		if(left<=n&&arr[left]>arr[i]){
			largest = left;
		}
		if(right<=n&&arr[right]>arr[largest]){
			largest = right;
		}
		if(largest!=i){
			swap(arr,i, largest);
			max_heapify(arr, largest, n);
		}
	}
	
	void build_heap(int[] arr){
		for(int i = arr.length/2;i>=1;i--){
			max_heapify(arr, i, arr.length-1);
		}
	}

	private void swap(int[] arr, int i, int largest) {
		int temp = arr[i];
		arr[i]= arr[largest];
		arr[largest] = temp;
	}
}
