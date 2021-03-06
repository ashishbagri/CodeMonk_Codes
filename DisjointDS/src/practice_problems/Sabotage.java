package practice_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Sabotage {
	public static void main(String[] args) {
		new Sabotage().start(new Scanner(System.in));
	}

	private int[] nodes;
	private int[] size;
	
	private void start(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		nodes = new int[n+1];
		size = new int[n+1];
		for(int i=1;i<=n;i++){
			nodes[i] = i;
			size[i] = 1;
		}
		int q = Integer.parseInt(sc.next());
		int count =0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		int index = 1;
		while(q-->0){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			if(connected(a,b)){
				count++;
				list.add(index);
			}else
				union(a,b);
			index++;
		}
		System.out.println(count);
		for(int x : list){
			System.out.println(x);
		}
	}
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (size[rootP] > size[rootQ]) {
			nodes[rootQ] = rootP;
			size[rootP] += size[rootQ];
		} else {
			nodes[rootP] = rootQ;
			size[rootQ] += size[rootP];
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
