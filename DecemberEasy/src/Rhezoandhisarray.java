import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Rhezoandhisarray {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int queries = sc.nextInt();
		
		long[] number = new long[length];
		for(int i=0;i<length;i++){
			number[i] = sc.nextLong();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<queries;i++){
			String[] query = br.readLine().split(" ");
			if(query[0].equals("1")){
				for(int j= Integer.parseInt(query[1])-1;j<=Integer.parseInt(query[2]);j++){
					number[j] = number[j]*Integer.parseInt(query[3]);
				}
				continue;
			}
			else{
				int count =0;
				for(int j=Integer.parseInt(query[2]);j>=Integer.parseInt(query[1])-1;j--){
					if(number[j]*Integer.parseInt(query[3])>=Integer.parseInt(query[4])){
						count++;
					}else{
						break;
					}
				}
				System.out.println(count);
			}
			
		}
	}
}
