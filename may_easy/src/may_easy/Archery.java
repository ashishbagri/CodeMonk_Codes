package may_easy;

import java.util.Scanner;

public class Archery {
	public static void main(String[] args) {
		new Archery().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while(tests-->0){
			int n = sc.nextInt();
			long result = 1;
			for(int i =0;i<n;i++){
				result = lcm(result,sc.nextInt());
			}
			System.out.println(result);
		}
		
	}

	private long lcm(long a, int b) {
		
		return ((a*b)/(gcd(a,b)));
	}

	private long gcd(long a, long b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}
