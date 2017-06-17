package may_easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LittleShinoandContests {

	public static void main(String[] args) throws Exception{
		new LittleShinoandContests().solve();
	}

	private void solve() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[5];
		int[] b = new int[5];
		String[] first = br.readLine().split(" ");
		String[] second = br.readLine().split(" ");
		
		for(int i =0;i<5;i++){
			a[i] = Integer.parseInt(first[i]);
			b[i] = Integer.parseInt(second[i]);
		}
		Arrays.sort(a);
		long sum = 1;
		for(int i =0;i<5;i++){
			int count = 5;
			for(int j =0;j<5;j++){
				if(a[]<=b[])
			}
		}
	}
}
