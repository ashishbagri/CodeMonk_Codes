import java.util.Scanner;

public class MarkTheAnswer {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long k = Long.parseLong(sc.next());
		int count = 0;
		int maxCount = 0;
		int skips = 0;
		long[] questions = new long[n];
		for(int i =0;i<n;i++){
			questions[i] = Long.parseLong(sc.next());
			if(skips==2){
				maxCount = count;//>=maxCount?count:maxCount;
				count=0;
				skips=0;
				break;
			}
			if(questions[i]<=k){
				count++;
			}else{
				skips++;
			}
		}
		System.out.println(maxCount>count?maxCount:count);
		
	}
}
