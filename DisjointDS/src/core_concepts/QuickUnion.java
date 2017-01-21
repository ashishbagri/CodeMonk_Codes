package core_concepts;

public class QuickUnion extends UnionFind {

	public QuickUnion(int n) {
		super(n);
	}

	/**
	 * Connects two point p and q depending upon depth of tree if a root have
	 * depth of N then one union operation would take N complexity
	 */
	@Override
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		nodes[rootP] = rootQ;
	}

	private int root(int p) {
		while (nodes[p] != p)
			p = nodes[p];
		return p;
	}

	/**
	 * Takes N complexity to find if two components are connected.
	 */
	@Override
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

}
