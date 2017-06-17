package binarytrees;

import java.util.Scanner;

public class DistinctCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while(tests-->0){
			int n = Integer.parseInt(sc.next());
			int x = Integer.parseInt(sc.next());
			
			Node root = null;
			for(int i =0 ;i <n;i++){
				root = put(root,Long.parseLong(sc.next()));
			}
			int distinct = size(root);
			if(x==distinct){
				System.out.println("Good");
			}else{
				if(distinct>x){
					System.out.println("Average");
				}else{
					System.out.println("Bad");
				}
			}
		}
	}

	private static Node put(Node root, long value) {
		if (root == null) {
			root = new Node(value);
		} else {
			long compare = root.value - value;

			if (compare > 0) {
				root.left = put(root.left, value);
			} 
			if(compare<0){
				root.right = put(root.right, value);
			}
			if(compare == 0){
				root.value = value;
			}
			
			root.count = 1+size(root.left)+size(root.right);

		}

		return root;
	}

	private static int size(Node right) {
		if(right==null){
			return 0;
		}else
			return right.count;
	}

	private static class Node {
		private long value;
		private Node left;
		private Node right;
		public int count = 1;

		public Node(long value) {
			this.value = value;
		}

	}
}
