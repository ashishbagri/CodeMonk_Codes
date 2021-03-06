import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class FindTheDenomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] denominations = {10,5,2,1};
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>(Collections.reverseOrder());
		for(int denimination : denominations){
			map.put(denimination, number/denimination);
			number%=denimination;
			if(number==0){
				break;
			}
		}
		Set<Integer> keys = map.keySet();
		for(int key :keys){
			int count = map.get(key);
			if(count==0){
				continue;
			}
			while(count-->0){
				System.out.print(key+" ");
			}
		}
	}
}
