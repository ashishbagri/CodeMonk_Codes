import java.util.Scanner;


public class BallElimination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int[] freq = new int[101];
		
		for(int i =0; i <length;i++){
			freq[Integer.parseInt(sc.next())]++;
		}
		
		int sum = 0;
		for(int i = 0;i <=100;i++){
			if(freq[i]%2!=0){
				sum+=(freq[i]%2);
			}
		}
		
		System.out.println(sum);
	}
}
