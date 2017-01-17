import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MonkTeachesPalindrome {
	public static void main(String[] args)  throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tests = sc.nextInt();
		while(tests-->0){
			String str = br.readLine();
			boolean flag = true;
			for(int i=0;i<str.length()/2;i++){
				if(str.charAt(i)!=str.charAt(str.length()-1-i)){
					flag = false;
					break;
				}
			}
			if(!flag){
				System.out.println("NO");
			}else
				if(str.length()%2==0){
					System.out.println("YES EVEN");
				}
				else
					System.out.println("YES ODD");
		}
	}
}
