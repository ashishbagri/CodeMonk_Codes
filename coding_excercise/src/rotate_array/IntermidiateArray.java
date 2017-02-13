package rotate_array;

public class IntermidiateArray {
	public void rotate(int[] arr, int k){
		if(k>arr.length){
			k%=arr.length;
		}
		int[] result = new int[arr.length];
		
		for(int i=0;i<k;i++){
			result[i] = arr[arr.length-k+i];
		}
		int i = 0;
		for(int j=k;j<arr.length;j++){
			result[j] = arr[i++];
		}
		System.arraycopy(result, 0, arr, 0, arr.length);
	}
}
