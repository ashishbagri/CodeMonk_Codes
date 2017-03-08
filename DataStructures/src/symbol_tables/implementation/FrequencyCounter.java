package symbol_tables.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Read a sequence of Strings from standard input and print out one that occurs
 * with highest frequency.
 * 
 * @author PaRV
 *
 */
public class FrequencyCounter {
	
	void countFrequency(String[] arr){
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String str : arr){
			if(map.containsKey(str)){
				map.put(str, map.get(str)+1);
			}else{
				map.put(str, 1);
			}
		}
		String max = "";
		Set<String> keys = map.keySet();
		for(String key : keys){
			if(map.get(key)>map.get(max))
				max = key;
		}
		System.out.println(String.format("%s %s", max,map.get(max)));
	}
	
	public static void main(String[] args) {
		new FrequencyCounter().countFrequency(new Scanner(System.in).next().split(" "));
	}
}
