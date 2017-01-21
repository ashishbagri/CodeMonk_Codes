package core_concepts;

public class WeightedQuickUnion extends UnionFind {

	private int[] size;

	public WeightedQuickUnion(int n) {
		super(n);
		size = new int[n];
	}

	/**
	 * Connects p and q. in logN complexity given root func
	 */
	@Override
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
	@Override
	public boolean connected(int p, int q) {
		// TODO Auto-generated method stub
		return root(p) == root(q);
	}

}
