package symbol_tables.elementry_implementation;

public class BSTMainClient {
	public static void main(String[] args) {
		
		BinarySearchTree<Integer, String> bst = new BinarySearchTree<Integer, String>();
		bst.put(1, "ashish");
		bst.put(2, "first");
		bst.put(6, "asdsa");
		bst.put(3, "asdasd");
		bst.put(4, "asdas");
		
		System.out.println(bst.get(3));
	}
}
