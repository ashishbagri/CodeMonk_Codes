
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node root = new Node(1);
		Node currentNode = root;
		for(int i =2;i<10;i++){
			currentNode.next = new Node(i);
			currentNode = currentNode.next;
		}
		
		Node prevNode = null;
		Node cNode = root;
		Node nextNode = null;
		while(cNode!=null){
			nextNode = cNode.next;
			cNode.next = prevNode;
			prevNode = cNode;
			cNode = nextNode;
		}
		root = prevNode;
		
		while(root!=null){
			System.out.println(root.id);
			root = root.next;
		}
	}
}
class Node{
	int id;
	Node next;
	
	Node(int id){
		this.id = id;
	}
}
