import java.util.Arrays;
import java.util.Scanner;


public class APeacefulWorld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		double[] r = new double[n];
		int i = 0;
		while(n-->0){
			int x = Integer.parseInt(sc.next());
			int y = Integer.parseInt(sc.next());
			
			r[i++] = Math.sqrt(x*x+y*y);
		}
		Arrays.sort(r);
		//Math.round(a)
		System.out.println(r[k-1]);
	}
}
