import java.util.Scanner;

public class Stevie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		long[] a = new long[nums];
		long[] b = new long[nums];
		long[] c = new long[nums];
		for(int i =0;i<nums;i++){
			a[i] = sc.nextLong();
		}
		for(int i =0;i<nums;i++){
			b[i] = sc.nextLong();
		}
		for(int i =0;i<nums;i++){
			for(int j=0;j<nums;j++){
				if(a[i]==a[j]){
					c[j]=b[i]>b[j]?b[i]:b[j];
				}
			}
		}
		for(int i =0;i<nums;i++){
			System.out.print(c[i]+" ");
		}
	}
}
