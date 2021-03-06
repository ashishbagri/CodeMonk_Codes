package growth_of_function;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[] = new int[]{1,4,9,3,2,5};
		new InsertionSort().insertionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	//1 4 9 3 2 5
	public void insertionSort(int[] nums){
		for(int i =1;i<nums.length;i++){
			//System.out.println("i is "+nums[i]);
			int key = nums[i];
			int j = i-1;
			while(j>0 && nums[j]>key){
				nums[i+1] = nums[i];
				
			}
		}
	}

	private void swap(int i, int j, int[] nums) {
		int a = nums[i];
		nums[i] = nums[j];
		nums[j] = a;
	}
}
