package heaps_and_prioritysort.concepts;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void test() {
		new MaxHeap().max_heapify(new int[]{0,1,2,3,4,5,6},1,6);
	}

}
