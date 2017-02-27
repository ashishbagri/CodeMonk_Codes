package heaps_and_prioritysort.concepts;

import java.util.Arrays;

public class BasicMaxPQ<Key extends Comparable<Key>> implements MaxPQ<Key> {

	private Object[] elementryData;
	private int size;
	private final static int defaultCapacity = 0xf>>1;
	private static final Object[] DEFAULT_EMPTY_ELEMENTARRAY = {};
	private int modcount = 0;
	
	public BasicMaxPQ() {
		elementryData = DEFAULT_EMPTY_ELEMENTARRAY;
	}

	public BasicMaxPQ(int capacity) {
		elementryData = (Key[]) new Comparable[capacity];
	}

	@Override
	public void insert(Key key) {
		ensureCapacity(size+1);
		elementryData[size++] = key;
	}

	private void ensureCapacity(int mincapacity) {
		if(elementryData == DEFAULT_EMPTY_ELEMENTARRAY){
			mincapacity = Math.max(defaultCapacity, mincapacity);
		}
		ensureExplicitCapacity(mincapacity);
	}

	private void ensureExplicitCapacity(int mincapacity) {
		modcount++;
		if(mincapacity - elementryData.length > 0)
			grow(mincapacity);
	}
	
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	private void grow(int mincapacity) {
		int oldCapacity = elementryData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if(newCapacity - mincapacity < 0){
			newCapacity = mincapacity;
		}
		if(newCapacity - MAX_ARRAY_SIZE > 0){
			newCapacity = hugeCapacity(mincapacity);
		}
		
		elementryData = Arrays.copyOf(elementryData, newCapacity);
	}

	private int hugeCapacity(int mincapacity) {
		if(mincapacity < 0 ){
			throw new OutOfMemoryError();
		}
		return mincapacity > MAX_ARRAY_SIZE ? Integer.MAX_VALUE: MAX_ARRAY_SIZE;
	}

	private void validateAndMaintainQueue() {
		// if(n>)
	}

	@Override
	public Key delMax() {
		maxify();
		return (Key)elementryData[--size];
	}

	private void maxify() {
		int max = 0;
		for (int i = 1; i < size; i++) {
			if (less(max, i))
				max = i;
		}
		exchange(max, size - 1);
	}

	private void exchange(int max, int i) {
		Object temp = elementryData[max];
		elementryData[max] = elementryData[i];
		elementryData[i] = temp;
	}

	private boolean less(int max, int i) {
		Key firstKey = (Key)elementryData[max];
		Key secondKey = (Key)elementryData[i];
		
		return firstKey.compareTo(secondKey)> 1 ? false : true;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Key max() {
		maxify();
		return (Key)elementryData[size-1];
	}

	@Override
	public int size() {
		return size;
	}
}
