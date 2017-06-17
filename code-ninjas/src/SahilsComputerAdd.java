import java.util.Scanner;


public class SahilsComputerAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		validate(sc.next());
	}

	private static void validate(String next) {
		if(next.charAt(0) == '.' || next.charAt(next.length()-1)=='.'){
			System.out.println("NO");
			return;
		}
		String[] str = next.split("\\.");
		if(str.length!=4){
			System.out.println("NO");
			return;
		}
		for(String s : str){
			if(0>Integer.parseInt(s) || Integer.parseInt(s) >255){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
