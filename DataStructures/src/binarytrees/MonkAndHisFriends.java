package binarytrees;

import java.util.Scanner;

public class MonkAndHisFriends {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		
		while(test-->0){
			Node root = null;
			
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			
			long[] monk = new long[n];
			long[] newmonk = new long[m];
			
			for(int i = 0;i<n;i++){
				root = put(root, Long.parseLong(sc.next()));
			}
			for(int i =0;i<m;i++){
				long num = Long.parseLong(sc.next());
				Node found = find(root,num);
				if(found==null){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
				put(root,num);
			}
		}
	}
	
	private static Node find(Node x, long value) {
		while(x!=null){
			long k = x.value-value;
			if(k==0){
				return x;
			}
			if(k>0)
				x = x.left;
			else
				x = x.right;
		}
		return x;
	}


	private static Node put(Node root, long value) {
		if(root==null){
			root = new Node(value);
		}else{
			long compare = root.value - value;
			
			if(compare>0){
				root.left = put(root.left,value);
			}
			if(compare<0){
				root.right = put(root.right,value);
			}
			if(compare==0){
				root.value = value;
			}
		}
		
		return root;
	}

	private static class Node{
		private long value;
		private Node left;
		private Node right;
		
		public Node(long value) {
			this.value = value;
		}
	}
}
