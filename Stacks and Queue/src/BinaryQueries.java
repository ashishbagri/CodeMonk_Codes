import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class BinaryQueries {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] digits = new int[length];
		int queries = sc.nextInt();
		for(int i=0;i<length;i++){
			digits[i]=sc.nextInt();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<queries;i++){
			
			String[] queryLine = null;
			try {
				queryLine = br.readLine().split(" ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(Integer.parseInt(queryLine[0])==0){
				findOddEven(digits,Integer.parseInt(queryLine[1]),Integer.parseInt(queryLine[2]));
			}else{
				flip(digits,Integer.parseInt(queryLine[1]));
			}
		}
	}

	private static void findOddEven(int[] digits, int parseInt, int parseInt2) {
		int pointer = 0;
		long num = 0;
		for(int i = parseInt2-1; i>=parseInt-1;i--){
			num+=(Math.pow(2, pointer++)*digits[i]);
		}
		System.out.println(oddEven(num));
	}

	private static String oddEven(long num) {
		if(num%2==0){
			return "EVEN";
		}
		return "ODD";
	}

	private static void flip(int[] digits, int parseInt) {
		if(digits[parseInt-1]==0){
			digits[parseInt-1]=1;
		}else
			digits[parseInt-1] =0;
	}
}
