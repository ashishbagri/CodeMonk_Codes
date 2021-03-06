package practice_problems;

import java.util.Scanner;

public class CityandCampers {

	private long max = 1;
	private long min = 1;
	private int[] nodes;
	private long[] size;
	private int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new CityandCampers().start(sc);
	}

	private void start(Scanner sc) {
		n = Integer.parseInt(sc.next());
		nodes = new int[n + 1];
		for (int i = 1; i <= n; i++)
			nodes[i] = i;
		size = new long[n + 1];
		for (int i = 1; i <= n; i++)
			size[i] = 1;
		int q = Integer.parseInt(sc.next());
		while (q-- > 0) {
			union(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
			/*long max = findMax(size);*/
			//min = findMin(size, max);
			// System.out.println(max-min+ "max = "+max+" min = "+min);
			if(n==1){
				System.out.println("0");
			}else
			System.out.println(max - min);
		}
		// Arrays.sort(size);

	}
	private long findSmallestGroup() {
    	long min = nodes.length;
    	for(int i=1; i<nodes.length; i++) { 
    		if(size[i] < min) { min = size[i]; }
            if(size[i] == this.min) { return this.min; } 
        }
        return min;
    }

	private long findMax(long[] size) {
		long max = size[1];
		for (int i = 2; i < size.length; i++) {
			if (size[i] > max)
				max = size[i];
		}
		return max;
	}

	private long findMin(long[] size, long max) {
		long min = max;
		for (int i = 1; i < size.length; i++) {
			if (size[i] == 0)
				continue;
			if (size[i] < min)
				min = size[i];
		}
		return min;
	}

	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (rootP == rootQ) {
			return;
		}
		if (size[rootP] > size[rootQ]) {
			nodes[rootQ] = rootP;
			size[rootP] += size[rootQ];
			//size[rootQ] = 0;
			if(size[rootP]>max){
				max = size[rootP];
			}
			if(size[rootQ] == min){
				min = findSmallestGroup();
			}
		} else {
			nodes[rootP] = rootQ;
			size[rootQ] += size[rootP];
			//size[rootP] = 0;
			if(size[rootQ]>max){
				max = size[rootQ];
			}
			if(size[rootP] == min){
				min = findSmallestGroup();
			}
			// System.out.println(size[rootQ]-size[rootP]);
		}
		n--;
	}

	protected int root(int p) {
		while (nodes[p] != p) {
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
}
