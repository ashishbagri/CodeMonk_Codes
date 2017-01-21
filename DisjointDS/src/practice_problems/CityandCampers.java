package practice_problems;

import java.util.Scanner;

public class CityandCampers {
	
	private int[] nodes;
	private int[] size;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new CityandCampers().start(sc);
	}

	private void start(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		nodes = new int[n+1];
		for (int i = 1; i <= n; i++)
			nodes[i] = i;
		size = new int[n+1];
		for (int i = 1; i <= n; i++)
			size[i] = 1;
		int q = Integer.parseInt(sc.next());
		while(q-->0){
			union(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
			System.out.println(findMax(size)-findMin(size));
		}
		//Arrays.sort(size);
		
		
	}
	private int findMax(int[] size) {
		int max = size[1];
		for(int i=2;i<size.length;i++){
			if(size[i]>max)
				max=size[i];
		}
		return max;
	}
	private int findMin(int[] size) {
		int min = -1;
		for(int i=1;i<size.length;i++){
			if(size[i]!=0&&size[i]<min)
				min=size[i];
		}
		if(min==-1)
			return findMax(size);
		return min;
	}

	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (size[rootP] > size[rootQ]) {
			nodes[rootQ] = rootP;
			size[rootP] += size[rootQ];
			size[rootQ] = 0;
			//System.out.println(size[rootP]-size[rootQ]);
		} else {
			nodes[rootP] = rootQ;
			size[rootQ] += size[rootP];
			size[rootP]=0;
			//System.out.println(size[rootQ]-size[rootP]);
		}
	}

	protected int root(int p) {
		while (nodes[p] != p)
			p = nodes[p];
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
