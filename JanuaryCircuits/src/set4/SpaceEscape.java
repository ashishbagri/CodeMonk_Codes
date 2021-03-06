package set4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SpaceEscape {

	private Map<Integer,Integer> leftOver;
	private Map<Integer,ArrayList<Integer>> connections;
	private int[][] cost;
	private int[][] carry;
	
	public SpaceEscape(int n) {
		leftOver = new HashMap<Integer, Integer>();
		connections = new HashMap<Integer, ArrayList<Integer>>();
		cost = new int[n+1][n+1];
		carry = new int[n+1][n+1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		new SpaceEscape(Integer.parseInt(sc.next())).start(sc);
	}

	private void start(Scanner sc) {
		int m = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		
		while(m-->0){
			int u = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());
			int carryOver = Integer.parseInt(sc.next());
			
			if(connections.get(u)==null){
				connections.put(u, new ArrayList<Integer>());
			}
			connections.get(u).add(v);
			
			if(connections.get(v)==null){
				connections.put(v, new ArrayList<Integer>());
			}
			connections.get(v).add(u);
			
			cost[u][v] = c;
			cost[v][u] = c;
			
			carry[u][v] = carryOver;
			carry[v][u] = carryOver;
		}
		
		System.out.println(process());
	}

	private char[] process() {
		
		return null;
	}
}
