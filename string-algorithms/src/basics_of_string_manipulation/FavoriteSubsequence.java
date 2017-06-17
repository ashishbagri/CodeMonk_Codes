package basics_of_string_manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FavoriteSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		Map<Character,Integer> countMap = new HashMap<Character, Integer>();
		countMap.put('a', 0);
		countMap.put('b', 0);
		countMap.put('c', 0);
		
		for(int i =0;i<input.length();i++){
			int n = countMap.get(input.charAt(i));
			countMap.put(input.charAt(i), n++);
		}
		
		int count = 0;
		
		String commonString = "abc";
		/*for(int i =0;i<commonString.length();i++){
			int n = countMap.get(commonString.charAt(i));
			if()
		}*/
		
	/*	while(input.contains("a")){
			input = input.substring(input.indexOf('a'));
			while(input.contains("b")){
				input =input.substring(input.indexOf('b'));
				while(input.contains("c")){
					input = input.substring(input.indexOf('c'));
					count++;
				}
			}
		}*/
		System.out.println(findCount("abc", "acbcab", 3, 6));
	}
	
	public static int findCount(String string, String string2, int m, int n){
		
		int count = 0;
		int lastindex = n-1;
		
		while(isSubSequence(string, string2, m, n, lastindex)){
			string2 = string2.substring(0, lastindex);
			count++;
		}
		
		return count;
		
	}
	public static boolean isSubSequence(String string, String string2, int m, int n,int lastindex)
	{
	    // Base Cases
	    if (m == 0){
	    	
	    	lastindex = n;
	    	return true;
	    }
	    if (n == 0) return false;
	 
	    // If last characters of two strings are matching
	    if (string.charAt(m-1) == string2.charAt(n-1))
	        return isSubSequence(string, string2, m-1, n-1,lastindex);
	 
	    // If last characters are not matching
	    return isSubSequence(string, string2, m, n-1,lastindex);
	}
}
