import java.util.Scanner;


public class DexterplayswithGP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			long r = sc.nextInt();
			long s = sc.nextInt();
			long p =sc.nextLong();
			int ans = -1;
			long n =1+r;
			long a = 1;
			for(int i=1;i<1000;i++){
				long term = (int)(Math.pow(r%p, i)%p);
				if(term==1)break;
				long currentSum = a+term;
				a= currentSum;
				if(s%p==currentSum%p){
					ans= i+1;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
