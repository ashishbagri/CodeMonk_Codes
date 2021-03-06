import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests  = sc.nextInt();
		while(tests-->0){
			String input = sc.next();
			int maxLength = -1;
			Map<Character,Integer> map = new HashMap<Character, Integer>();
			
			for(int i =0 ;i <input.length();i++){
				if(map.get(input.charAt(i))==null){
					map.put(input.charAt(i), i);
				}else{
					int firstOccurence = map.get(input.charAt(i));
					int length = i - firstOccurence - 1;
					maxLength = maxLength>length?maxLength:length;
				}
			}
			System.out.println(maxLength);
		}
	}
}
