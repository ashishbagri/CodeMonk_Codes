package heaps_and_prioritysort.concepts;


public class PQClient {
	public static void main(String[] args) {
	
		MaxPQ<Integer> pq = new BasicMaxPQ<Integer>();
		pq.insert(45);
		pq.insert(99);
		pq.insert(1);
		pq.insert(3);
		pq.insert(5);
		pq.insert(2);
		pq.insert(7);
		
		System.out.println(pq.size());
		System.out.println(pq.max());
		System.out.println(pq.delMax());
		System.out.println(pq.max());
		System.out.println(pq.delMax());
		System.out.println(pq.max());
		
	}
}
