import java.util.Scanner;


public class FredoAndGame {
	public static void main(String[] args) {
		new FredoAndGame().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			int a = sc.nextInt();
			int n = sc.nextInt();
			
			int[] obstacles = new int[n];
			int found = -1;
			for(int i =0;i<n;i++){	
				if(a==0){
					if(i==n){
						break;
					}else{
						found=i;
						break;
					}
				}
				obstacles[i] = Integer.parseInt(sc.next());
				if(obstacles[i]==1)
					a+=2;
				else
					a-=1;				
				
			}
			if(found==-1){
				System.out.println(String.format("Yes %s", a));
			}else
				System.out.println(String.format("No %s", found));
				
		}
	}
	
}
