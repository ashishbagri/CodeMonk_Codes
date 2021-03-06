package core_concepts;

/**
 * Gives constant time for find operation but union operation takes N time.
 * Hence for worst case, if N union operations needs to be done on N items, then
 * it would take N^2 complexity. Q(n^2)
 * 
 * @author PaRV
 *
 */
public class QuickFind extends UnionFind {

	/**
	 * Gives constant time for find operation but union operation takes N time.
	 * Hence for worst case, if N union operations needs to be done on N items,
	 * then it would take N^2 complexity. Q(n^2)
	 * 
	 * @author PaRV
	 *
	 */
	public QuickFind(int n) {
		super(n);
	}

	/**
	 * Connects two elements by scanning whole nodes tree and see if any node
	 * has value equal to first node then change it to second element.
	 *
	 * For each union we would need to scan the whole nodes tree and hence it
	 * will take N. Q(n)
	 * 
	 * @param p
	 * @param q
	 */
	@Override
	public void union(int p, int q) {
		int pId = nodes[p];
		int qId = nodes[q];

		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i] == pId) {
				nodes[i] = qId;
			}
		}

	}

	/**
	 * Check of both index has the same id; if yes then both are connected.
	 * 
	 * Takes constant time to see if two nodes are connected. Q(1)
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	@Override
	public boolean connected(int p, int q) {
		return nodes[p] == nodes[q];
	}

}
