package core_concepts;

public class PathCompression extends WeightedQuickUnion{

	public PathCompression(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected int root(int p){
		while(p!=nodes[p]){
			nodes[p] = nodes[nodes[p]];
			p=nodes[p];
		}
		return p;
	}

}
