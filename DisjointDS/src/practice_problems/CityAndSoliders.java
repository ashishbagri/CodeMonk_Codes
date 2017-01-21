package practice_problems;

import java.util.Scanner;

/**
 * Today, King Trophies is on another rampage to destroy the small village
 * controlled by Alex. Please help his soldiers.
 * 
 * At first, there are N individual soldiers, who haven't yet joined together;
 * each of these soldiers is the leader of his/her own group. You have to handle
 * 3 types of operations:
 * 
 * 1) Two groups find each other, and the leader of the first group steps down.
 * 
 * 2) A becomes leader of his group
 * 
 * 3) Output the leader of a certain group
 * 
 * Input:
 * 
 * The first line contains the number N, the number of soldiers, and Q, the
 * number of operations.
 * 
 * The next Q lines contains operations in the following format:
 * 
 * 1 a b: Groups containing person a and person b find each other, and the
 * leader of the group containing person a steps down, i.e., leader of group
 * containing b becomes the leader of the merged group. If a is in b's group or
 * vice versa ignore the operation.
 * 
 * 2 a: a becomes the leader of his group.
 * 
 * 3 a: Output the leader of the group containing person a.
 * 
 * Output:
 * 
 * Output the answer for each query of type 3.
 * 
 * Constraints:
 * 
 * 1 <= N <= 105
 * 
 * 1 <= Q <= 105
 * 
 * SAMPLE INPUT 2 2 1 1 2 3 1 SAMPLE OUTPUT 2
 * 
 * @author PaRV
 *
 */
public class CityAndSoliders {

	private static int[] nodes;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		nodes = new int[n + 1];
		for (int i = 1; i <= n; i++)
			nodes[i] = i;
		while (m-- > 0) {
			int command = Integer.parseInt(sc.next());
			if (command == 1) {
				int a = Integer.parseInt(sc.next());
				int b = Integer.parseInt(sc.next());
				union(a, b);
				continue;
			}
			if (command == 2) {
				int a = Integer.parseInt(sc.next());
				int rootA = root(a);
				nodes[rootA] = a;
				nodes[a] = a;
				continue;
			}
			if (command == 3) {
				int a = Integer.parseInt(sc.next());
				System.out.println(root(a));
				continue;
			}
		}
	}

	public static void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		nodes[rootP] = rootQ;
	}

	private static int root(int p) {
		while (nodes[p] != p)
			p = nodes[p];
		return p;
	}
}
