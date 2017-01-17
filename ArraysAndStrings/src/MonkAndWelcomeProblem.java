import java.util.Scanner;


public class MonkAndWelcomeProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] A = new int[length];
		int[] B = new int[length];
		int[] C = new int[length];
		for(int i=0;i<length;i++){
			A[i] = sc.nextInt();
		}
		for(int i=0;i<length;i++){
			B[i] = sc.nextInt();
		}
		for(int i=0;i<length;i++){
			System.out.print(A[i]+B[i]+" ");
		}
	}
}
