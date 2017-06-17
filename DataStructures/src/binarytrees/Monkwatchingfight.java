package binarytrees;

import java.util.Scanner;


public class Monkwatchingfight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		for(int i =0;i <n;i ++){
			root = put(root,Integer.parseInt(sc.next()));
		}
		System.out.println(findHeight(root));
	}
	
	private static int findHeight(Node root) {
		
		if(root==null){
			return 0;
		}
		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.right);
		
		if(leftHeight>rightHeight){
			return leftHeight+1;
		}else{
			return rightHeight+1;
		}
	}

	private static Node put(Node root, long value) {
		if(root==null){
			root = new Node(value);
		}else{
			long compare = root.value - value;
			
			if(compare>=0){
				root.left = put(root.left,value);
			}
			else{
				root.right = put(root.right,value);
			}
			
		}
		
		return root;
	}

	private static class Node{
		private long value;
		private Node left;
		private Node right;
		public int height = 1;
		
		public Node(long value) {
			this.value = value;
		}
		
		public void increment(){
			height++;
		}
	}
}

