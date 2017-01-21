package dayZero;

import java.util.Scanner;

public class MicroHouse {
	public static void main(String[] args) {
		/*System.out.println(1^5^9);
		System.out.println(3^5^7);*/
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[][] rect = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				rect[i][j]= Integer.parseInt(sc.next());
		}
		findMaxLuck(rect,n,m);
	}

	private static void findMaxLuck(int[][] rect, int n, int m) {
		int max = 0;
		int luckScore =0;
		for(int i=0;i<rect.length;i++){
			for(int j=0;j<rect[i].length;j++){
				luckScore^=rect[i][j];
			}
			if(luckScore>max){
				max = luckScore;
			}
			luckScore = 0;
		}
		for(int j=0;j<m;j++){
			for(int i=0;i<n;i++){
				luckScore^=rect[i][j];
			}
			if(luckScore>max){
				max = luckScore;
			}
			luckScore = 0;
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<m;j++){
				luckScore^=rect[i][j];
			}
			if(luckScore>max){
				max = luckScore;
			}
			luckScore = 0;
		}
		for(int i=n-1;i>=0;i--){
			for(int j=n-1-i;j<m;j++){
				luckScore^=rect[i][j];
			}
			if(luckScore>max){
				max = luckScore;
			}
			luckScore = 0;
		}
		
		System.out.println(max);
	}
}
