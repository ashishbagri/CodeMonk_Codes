import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SimpleTreeProblem {
	public static void main(String[] args) {
		new SimpleTreeProblem().solve();
		
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int q = sc.nextInt();
		
		
		int[] nodeValue = new int[n];
		Map<Integer,Pair> connectedMap = new HashMap<Integer, Pair>();
		Map<Integer,Integer> notConnectedMap = new HashMap<Integer, Integer>();
		
		for(int i =0;i<n;i++){
			nodeValue[i] = sc.nextInt();
			
		}
		for(int i =0;i<n-1;i++){
			connectedMap.put(i+1,new Pair(sc.nextInt(), sc.nextInt()));
		}
		for(int i =0;i<q;i++){
			int edgeNumber = sc.nextInt();
			Pair pair = connectedMap.get(edgeNumber);
			connectedMap.remove(edgeNumber);
			System.out.println(connectedPairs(n));
		}
	}
	
	private String connectedPairs(int n) {
		for(int i =1;i<=n;i++){
			
		}
		return null;
	}

	class Pair{
		
		private int u = 0;
		private int v = 0;
		
		Pair(int u, int v){
			this.u = u;
			this.v = v;
		}
		
		public int calculateD(){
			return Math.abs(u-v);
		}
	}
	
}
