package rotate_array;

public class BubbleRotate {
	
	public void rotate(int arr[], int k){
		for(int i=0;i<k;i++)
			for(int j=arr.length-1;j>0;j--){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1]= temp;
			}
	}
}
