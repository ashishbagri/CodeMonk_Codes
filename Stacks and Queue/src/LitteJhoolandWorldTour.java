import java.util.Scanner;


public class LitteJhoolandWorldTour {
	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			int numberOfCounteries = (int) sc.nextLong();
			boolean[] visitedCounteries = new boolean[numberOfCounteries];
			int ranges = sc.nextInt();
			String flag = "YES";
			while(ranges-->0){
				int first = sc.nextInt();
				int second = sc.nextInt();
				if(visitedCounteries[first]){
					if(visitedCounteries[second]){
						flag ="NO";
						break;
					}else{
						visitedCounteries[second] = true;
					}
				}else{
					visitedCounteries[first] = true;
				}
			}
			System.out.println(flag);
		}
	}
}
