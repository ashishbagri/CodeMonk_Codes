package may_easy;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LittleShinoandSubstringQuery {
	public static void main(String[] args) {
		new LittleShinoandSubstringQuery().solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		int q = sc.nextInt();
		Map<String,Integer> map = new TreeMap<String, Integer>();
		
		
		for(int i =0;i<tests;i++){
			map.put(sc.next(), i);
		}
		NavigableMap<String, Integer> nmap=((TreeMap<String, Integer>) map).descendingMap();
		for(int i =0;i<q;i++){
			int small = -1;
			int large = -1;
			String str = sc.next();
			for(Map.Entry<String,Integer> entry : map.entrySet()){
				if(entry.getKey().contains(str)){
						small=entry.getValue();
					break;
				}
			}
			for(Map.Entry<String, Integer> entry : nmap.entrySet()){
				if(entry.getKey().contains(str)){
					large=entry.getValue();
				break;
				}
			}
			System.out.println(small+" "+large);
		}
		
	}
}
