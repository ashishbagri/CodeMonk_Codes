import java.util.Scanner;


public class CeaserChipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			String first = sc.next();
			String second = sc.next();
			if(first.length()!=second.length()){
				System.out.println(-1);
				return;
			}
			int diff = second.charAt(0)-first.charAt(0);
			for(int i = 1; i<first.length();i++){
				if(diff!=second.charAt(i)-first.charAt(i)){
					System.out.println(-1);
					return;
				}
			}
			if(diff<0){
				diff=26-diff;
			}
			System.out.println(diff);
		}
	}
}
