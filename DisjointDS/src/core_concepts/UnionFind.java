package core_concepts;

public abstract class UnionFind implements DisjointDS {

	protected int[] nodes;

	/**
	 * Initiate Union Find object by the number of objects required.
	 * 
	 * @param n
	 */
	public UnionFind(int n) {
		nodes = new int[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = i;
		}
	}

	/**
	 * Connects given two point p and q.
	 */
	@Override
	public abstract void union(int p, int q);

	/**
	 * Finds if two given points are connected.
	 */
	@Override
	public abstract boolean connected(int p, int q);

}
