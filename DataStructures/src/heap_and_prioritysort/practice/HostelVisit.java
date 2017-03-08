package heap_and_prioritysort.practice;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HostelVisit {

	private static Scanner sc = new Scanner(System.in);
	private static PriorityQueue<Long> pq = new PriorityQueue<Long>(new Comparator<Long>() {

		@Override
		public int compare(Long o1, Long o2) {
			if (o1 < o2) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			}
			return 0;
		}
	});
	private static int k;

	public static void main(String[] args) {

		int queries = Integer.parseInt(sc.next());
		k = Integer.parseInt(sc.next());

		while (queries-- > 0) {
			int queryType = Integer.parseInt(sc.next());
			if (queryType == 1) {
				buildHeap();
			} else {
				System.out.println(max(k));
			}
		}
	}

	private static long max(int k) {
		Queue<Long> q = new LinkedList<Long>();
		return pq.peek();
	}

	private static void buildHeap() {
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		long x1 = x * x;
		long y1 = y * y;
		long dis = x1 + y1;
		pq.add(dis);
		if (pq.size() > k)
			pq.poll();
	}
}
