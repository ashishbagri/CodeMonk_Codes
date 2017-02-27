package heaps_and_prioritysort.concepts;

public interface MaxPQ<Key extends Comparable<Key>> {

	void insert(Key key);

	Key delMax();

	boolean isEmpty();

	Key max();

	int size();
}
