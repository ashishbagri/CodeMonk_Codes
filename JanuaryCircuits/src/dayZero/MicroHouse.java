package dayZero;

import java.util.Scanner;

public class MicroHouse {
	private static long[][] rect;
	
	public static void main(String[] args) {
		System.out.println(2^1);
		System.out.println(2^2);
		System.out.println(2^3);
		System.out.println(2^4);
		System.out.println(2^5);
		System.out.println(2^6);
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		rect = new long[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				rect[i][j]= Long.parseLong(sc.next());
		}
		findMaxLuck(n,m);
	}

	private static void findMaxLuck(int n, int m) {
		long[] temp = new long[n];
		long max =0;
		for(int left=0;left<m;left++){
			for(int i=0; i < n; i++){
                temp[i] = 0;
            }
			for(int right=left;right<m;right++){
				for(int i=0;i<n;i++){
					temp[i]^=rect[i][right];
					
					if(temp[i]>max)
						max = temp[i];
				}
				long luck = findLuck(temp,max);
				if(luck>max){
					max=luck;
				}
			}
			
		}
		System.out.println(max);
		
	}

	private static long findLuck(long[] temp, long max) {
		long luck =0;
		for(int top=0;top<temp.length;top++){
			//luck = temp[i];
			for(int bottom=top;bottom<temp.length;bottom++){
				luck^=temp[bottom];
				if(luck>max)
					max=luck;
			}
		}
		return max;
	}
}
