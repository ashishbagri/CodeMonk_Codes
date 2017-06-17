package binarytrees;

import java.util.Scanner;

public class TestBinaryTrees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		Node root = new Node(Integer.parseInt(sc.next()));
		for(int i = 0;i <n ;i ++){
			String str = sc.next();
			int data = Integer.parseInt(sc.next());
			Node found = root;
			for(int j =0 ;j<str.length();j++){
				found = put(found,str.charAt(i),data);
			}
			found = new Node(data);
		}
		
		
		
	}
	private static Node put(Node root, char charAt, int data) {
		if(charAt=='L'){
			return root.left;
		}else{
			return root.right;
		}
		
	}
	private static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
}
