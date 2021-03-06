package practice_problems;

import java.util.Scanner;

/**
 * Fatland is a town that started with N distinct empires, namely empires 1, 2,
 * ..., N. But over time, the armies of some of these empires have taken over
 * other ones. Each takeover occurred when the army of empire i invaded empire
 * j. After each invasion, all of empire j became part of empire i, and empire j
 * was renamed as empire i.
 * 
 * Empire Huang, leader of Badland, wants to invade Fatland. To do this, he
 * needs to calculate how many distinct empires still remain in Fatland after
 * all the takeovers. Help him with this task.
 * 
 * Input:
 * 
 * The first line contains an integer N, the number of empires that were
 * originally in Fatland.
 * 
 * The second line contains an integer K, denoting the number of takeovers that
 * took place.
 * 
 * Each of the next K lines contains 2 space-separated integers i, j,
 * representing that the army of empire i took over that of empire j. As a
 * result, empire j does not exist anymore and is now renamed as empire i. It is
 * guaranteed that empire i still exists.
 * 
 * Output: Output one integer, the number of empires that exist in Fatland.
 * 
 * Constraints:
 * 
 * 1 <= N <= 105
 * 
 * 1 <= K <= 105
 * 
 * SAMPLE INPUT 4 2 1 2 4 1 SAMPLE OUTPUT 2 Explanation Fatland started with
 * empires 1, 2, 3, 4. First, empire 1 invaded empire 2, so empire 2 was renamed
 * to empire 1. Then, empire 4 invaded empire 1. So what were at the beginning
 * empires 1 and 2 were renamed to empire 4. Now, only empires 3 and 4 remain,
 * so the answer is 2.
 * 
 * @author PaRV
 *
 */
public class CityAndFlood {

	private static int nodes[];
	private static int size[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfEmpires = Integer.parseInt(sc.next());
		nodes = new int[numberOfEmpires+1];
		size = new int[numberOfEmpires+1];
		init();
		int numberOfInvasions = Integer.parseInt(sc.next());
		while(numberOfInvasions-->0){
			invade(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
		}
		System.out.println(count());
	}

	private static void init() {
		for(int i=1;i<nodes.length;i++){
			nodes[i] = i;
		}
	}
	private static String count() {
		int count =0;
		for(int i=1;i<nodes.length;i++){
			if(nodes[i]==i){
				count++;
			}
		}
		return count+"";
	}

	protected static int root(int p) {
		while (nodes[p] != p)
			p = nodes[p];
		return p;
	}

	private static void invade(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);
		if (size[rootP] > size[rootQ]) {
			nodes[rootQ] = rootP;
			size[rootP] += size[rootQ];
		} else {
			nodes[rootP] = rootQ;
			size[rootQ] += size[rootP];
		}
	}
	
}
