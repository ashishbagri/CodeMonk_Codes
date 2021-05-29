public class BinaryHeap {

    public static void main(String[] args) {
        new BinaryHeap().buildHeap(new int[]{3,5,2,6,9,7,4});
    }

    private void buildHeap(int[] arr){
        int n = arr.length;

        for(int i = (n/2)-1;i>=0;i--){
            heapify(arr,i);
        }
    }

    private void heapify(int[] arr, int i) {
        int left = arr[2 * i + 1];
        int right = arr[2 * i + 2];

        int maxIndex = i;
        if (left<arr.length && arr[i] < arr[left]) {
            maxIndex = left;
        }
        if (right<arr.length && arr[i] < arr[right]) {
            maxIndex = right;
        }
        if (i != maxIndex) {
            swap(arr, i, maxIndex);
            heapify(arr,maxIndex);
        }
    }

    private void swap(int[] arr, int i, int j){
           int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}