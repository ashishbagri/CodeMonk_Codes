package codemonk_disjoint_challenge;

import java.util.Scanner;

/**
 * There are N N students and M M relationships of the form u u v v, which means
 * that student u u and student v v are friends. If two students are not friends
 * directly but they have a mutual friend, then they too become friends. Your
 * task is to count the number of friends of the i t h ith student where 1 ≤ i ≤
 * N 1≤i≤N.
 * 
 * Input: The first line consists of two integers N N and M M denoting the
 * number of students and the number of relationships respectively. The next M M
 * lines consists of two integers u u and v v denoting that student u u and
 * student v v are friends. u u and v v can never be equal and relationships are
 * not repeated.
 * 
 * Output: Print N N space separated integers which tells us the number of
 * friends of the i t h ith student.
 * 
 * Constraints: 1 ≤ N ≤ 10 5 1≤N≤105 1 ≤ M ≤ 10 5 1≤M≤105 1 ≤ u , v ≤ N 1≤u,v≤N
 * 
 * SAMPLE INPUT 4 3 4 3 2 4 2 3 SAMPLE OUTPUT 0 2 2 2 Explanation For the sample
 * test case - Student 1 1 has no friends. Student 2 2 is friends with student 3
 * 3 and 4 4. Student 3 3 is friends with student 2 2 and 4 4. Student 4 4 is
 * friends with student 2 2 and 3 3.
 * 
 * @author PaRV
 *
 */
public class CountFriends {

	private int[] nodes;
	private int[] size;

	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (rootP == rootQ) {
			return;
		}

		if (size[rootP] > size[rootQ]) {
			nodes[rootQ] = rootP;
			size[rootP] += size[rootQ];
			size[rootQ] = 0;
		} else {
			nodes[rootP] = rootQ;
			size[rootQ] += size[rootP];
			size[rootP] = 0;
		}

	}

	protected int root(int p) {
		while (p != nodes[p]) {
			nodes[p] = nodes[nodes[p]];
			p = nodes[p];
		}
		return p;
	}

	/**
	 * Finds if two points are connected by logN complexity
	 */
	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		return root(p) == root(q);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new CountFriends().start(sc);

	}

	private void start(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		nodes = new int[n + 1];
		size = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			nodes[i] = i;
			size[i] = 1;
		}

		while (m-- > 0) {
			union(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(size[root(i)] - 1 + " ");
		}
	}
}
