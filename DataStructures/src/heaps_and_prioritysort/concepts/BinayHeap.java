package heaps_and_prioritysort.concepts;

public class BinayHeap<Key extends Comparable<Key>> {

	private Key[] elementryData;
	private int currentIndex;

	public BinayHeap(int capacity) {
		//this.currentIndex = capacity;
		elementryData = (Key[]) new Comparable[capacity + 1];
	}

	public boolean isEmpty() {
		return currentIndex == 0;
	}

	public void insert(Key key) {

		elementryData[++currentIndex] = key;
		swim(currentIndex);
	}

	public Key delMax() {

		Key maxKey = elementryData[1];
		exchange(1, currentIndex--);
		sink(1);
		elementryData[currentIndex + 1] = null;
		return maxKey;

	}

	private void sink(int index) {
		while (index * 2 <= currentIndex) {
			int childIndex = index * 2;
			if(childIndex < currentIndex && less(childIndex,childIndex+1)){
				childIndex++;
			}
			if(!less(index, childIndex))
				break;
			exchange(index, childIndex);
			index = childIndex;
		}
	}

	private void swim(int index) {
		while (index > 1 && less(index / 2, index)) {
			exchange(index, index / 2);
			index = index / 2;
		}
	}

	private void exchange(int firstIndex, int secondIndex) {
		Key firstKey = elementryData[firstIndex];
		Key secondKey = elementryData[secondIndex];
		elementryData[secondIndex] = firstKey;
		elementryData[firstIndex] = secondKey;
	}

	private boolean less(int firstIndex, int secondIndex) {

		return elementryData[firstIndex].compareTo(elementryData[secondIndex]) < 0;
	}
	
	public void sort(Comparable[] a){
		int n = a.length;
		for(int i = n/2;i>0;i--){
			sink(a,i,n);
		}
		while(n>1){
			exchange(1, n);
			sink(1);
		}
	}

	public void sink(Comparable[] a, int index, int n) {
		while (index * 2 <= n) {
			int childIndex = index * 2;
			if(childIndex < n && less(childIndex,childIndex+1)){
				childIndex++;
			}
			if(!less(index, childIndex))
				break;
			exchange(index, childIndex);
			index = childIndex;
		}
		
	}
}