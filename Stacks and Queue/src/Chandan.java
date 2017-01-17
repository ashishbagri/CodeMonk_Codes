import java.util.Scanner;
import java.util.Stack;


public class Chandan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<len;i++){
			int number = sc.nextInt();
			if(number==0){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}else{
				stack.push(number);
			}
		}
		int sum = 0;
		for(int i=0;i<=stack.size();i++){
			sum+=stack.pop();
		}
		System.out.println(sum);
	}
}
