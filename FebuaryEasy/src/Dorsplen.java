import java.util.Arrays;
import java.util.Scanner;

/**
 * Edward is playing a simplified version of game called "Dorsplen". This game
 * is played with gems of three different colors: red, green and blue. Initially
 * player has no gem and there are infinitely many gems of each color on the
 * table.
 * 
 * On each turn a player can either acquire gems or buy an artifact. Artifact
 * can be bought using gems. On acquiring gems player can get three gems of
 * distinct colors or two gems of the same color from the table.
 * 
 * Edward is planning to buy an artifact, it costs r r red gems, g g green gems
 * and b b blue gems. Compute, what is the minimum number of turns Edward has to
 * make to earn at least r r red gems, g g green gems and b b blue gems, so that
 * he will be able to buy the artifact.
 * 
 * Input format
 * 
 * Input contains three integers in a single line r r, g g and b b — the number
 * of red, green and blue gems, respectively, required to buy the artifact.
 * 
 * Constraints
 * 
 * 0 ≤ r , g , b ≤ 10 18 0≤r,g,b≤1018 Output format
 * 
 * Output single integer: the minimum number of turns Edward has to make to be
 * able to buy the artifact.
 * 
 * SAMPLE INPUT 4 5 8 SAMPLE OUTPUT 7 Explanation Edward has to get two blue
 * gems and then each of the next six turns get one of each red, green and blue
 * gems.
 * 
 * Edward will end with 6 red gems, 6 green gems and 8 blue gems, which is
 * enough to buy the artifact.
 * 
 * Time Limit: 2.0 sec(s) for each input file. Memory Limit: 256 MB Source
 * Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class Dorsplen {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] nums = new long[3];
		nums[0] = Long.parseLong(sc.next());
		nums[1] = Long.parseLong(sc.next());
		nums[2] = Long.parseLong(sc.next());
		
		long ans = 0;
		Arrays.sort(nums);
		ans+=nums[0];
		nums[1]-=nums[0];
		nums[2]-=nums[0];
		ans+=nums[1];
		nums[2]-=nums[1];
		ans+= (nums[2]%2)+(nums[2]/2);
		System.out.println(ans);
	}

}
