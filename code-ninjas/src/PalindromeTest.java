import java.util.Scanner;


public class PalindromeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tests = sc.nextInt();
		while(tests-->0){
			String s = sc.next();
			checkPalindrome(s);
		}
	}

	private static void checkPalindrome(String s) {
		for(int i = 0;i<s.length()/2;i++){
			if(s.charAt(s.length()-1-i)!=s.charAt(i)){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
