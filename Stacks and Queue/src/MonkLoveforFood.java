import java.util.Scanner;
import java.util.Stack;


public class MonkLoveforFood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfQueries = sc.nextInt();
		Stack<Integer> pile = new Stack<Integer>();
		while(numberOfQueries-->0){
			
			int query = sc.nextInt();
			if(query==1){
				if(pile.isEmpty()){
					System.out.println("No Food");
				}else{
					System.out.println(pile.pop());
				}
			}
			if(query==2){
				int packageCost = sc.nextInt();
				pile.push(packageCost);
			}
		}
	}
}
