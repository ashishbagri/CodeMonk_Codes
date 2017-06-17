package binarytrees;

import java.util.Scanner;

public class TestYourUnderstanding {
	private static Node root = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i =0 ;i <n;i++){
			root = put(root,Integer.parseInt(sc.next()));
		}
		int key = sc.nextInt();
		get(key);
	}
	
	private static void get(int key) {
		Node x = root;
		Node found = null;
		while(x!=null){
			int k = x.value-key;
			if(k==0){
				found = x;
			}
			if(k>0)
				x = x.left;
			else
				x = x.right;
		}
		preorder(found);
	}

	private static void preorder(Node found) {
		if(found==null){
			return;
		}
		System.out.println(found.value);
		preorder(found.left);
		preorder(found.right);
	}

	private static Node put(Node root, int value) {
		if(root==null){
			root = new Node(value);
		}else{
			int compare = root.value-value;
			if(compare>0)
				root.left = put(root.left,value);
			if(compare<0)
				root.right = put(root.right,value);
			if(compare == 0)
				root.value = value;
		}
		
		return root;
	}

	private static class Node{
		private int value;
		private Node left;
		private Node right;
		Node(int value){
			this.value = value;
		}
	}
}
