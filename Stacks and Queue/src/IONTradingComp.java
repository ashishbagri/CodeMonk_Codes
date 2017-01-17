import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class IONTradingComp {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
		for(int i=0;i<length;i++){
			int number = sc.nextInt();
			map.put(Math.abs(number), number);
		}
		for(Entry<Integer,Integer> entry : map.entrySet()){
			System.out.print(entry.getValue()+" ");
		}
	}
}
