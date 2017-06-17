package may_easy;

import java.util.Scanner;

public class GasStations {
	public static void main(String[] args) {
		new GasStations().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		long x = sc.nextLong();
		long count = 0;
		while(tests-->0){
			long current = sc.nextLong();
			if(x-current<=0){
				count++;
				break;
			}else
				count++;
			x-=current;
		}
		System.out.println(count);
	}
}
