import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NearVsMello {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			if(str==null){
				System.out.println("ex");
			}
			String[] s = str.split(" ");
			int[] h = new int[n];
			for (int i = 0; i < n; i++) {
				h[i] = Integer.parseInt(s[i]);
			}
			System.out.println(solve(n, h));
		} catch (Exception e) {
			System.out.println("exception");
		}
	}

	public static int solve(int n, int[] h) {
		int sum = 0;
		Arrays.sort(h);
		for (int i = n - 2; i >= 0; i--) {
			sum += h[n - 2] - h[i];
		}
		return sum;
	}

}
