package symbol_tables.elementry_implementation;

public class BinarySearchTree<Key extends Comparable<Key>, Value> {

	private Node root;

	private class Node {

		private Key key;
		private Value value;
		private Node left, right;

		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return String.format("%s %s", key,value);
		}
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}
	
	private Node put(Node root, Key key,Value value){
		if(root==null)
			return new Node(key,value);
		
		int compare = key.compareTo(root.key);
		if(compare<0)
			root.left = put(root.left, key, value);
		if(compare>0)
			root.right = put(root.right,key,value);
		if(compare == 0){
			root.value = value;
		}
		return root;
	}

	public Value get(Key key) {
		Node x = root;

		while (x != null) {
			int compare = key.compareTo(x.key);
			if (compare < 0)
				x = x.left;
			if (compare > 0)
				x = x.right;
			if (compare == 0)
				return x.value;
		}
		return null;
	}

	public void delete(Key key) {

	}

	public Iterable<Key> iterator() {
		return null;
	}
}
