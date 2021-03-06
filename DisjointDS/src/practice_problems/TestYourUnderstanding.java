package practice_problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * You are given number of nodes, N N, and number of edges, M M, of a undirected
 * connected graph. After adding each edge, print the size of all the connected
 * components (in increasing order).
 * 
 * Input: First line contains two integers, N N and M M, number of nodes and
 * number of edges. Next M M lines contains two integers each, X X and Y Y,
 * denoting that there is an edge between X X and Y Y.
 * 
 * Output: For each edge, print the size of all the connected components (in
 * increasing order) after adding that edge.
 * 
 * Constraints: 1 ≤ N ≤ 10 3 1≤N≤103 1 ≤ M ≤ N − 1 1≤M≤N−1 1 ≤ X , Y ≤ N 1≤X,Y≤N
 * SAMPLE INPUT 5 4 1 2 3 4 4 5 1 3 SAMPLE OUTPUT 1 1 1 2 1 2 2 2 3 5
 * 
 * @author PaRV
 *
 */
public class TestYourUnderstanding {
	
	private static int[] nodes;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfNodes = Integer.parseInt(sc.next());
		int numberOfEdges = Integer.parseInt(sc.next());
		
		nodes = new int[numberOfNodes+1];
		initializeNodes(nodes);
		while(numberOfEdges-->0){
			union(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
			System.out.println(group());
		}
	}

	private static char[] group() {
		connections = new int[nodes.length];
		for(int i=1;i<nodes.length;i++){
			connections[nodes[i]]++;
		}
		Arrays.sort(connections);
		String str = "";
		for(int i=0;i<connections.length;i++){
			if(connections[i]!=0){
				str+=connections[i]+" ";
			}
		}
		return str.toCharArray();
	}

	private static int connections[];
	

	private static void union(int parseInt, int parseInt2) {
		
		int temp = nodes[parseInt];
		for(int i=1;i<nodes.length;i++){
			if(nodes[i]==temp){
				nodes[i]= nodes[parseInt2];
			}
		}
		
	}

	private static void initializeNodes(int[] nodes) {
		for(int i=1;i<nodes.length;i++){
			nodes[i] = i;
		}
	}

}
