import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class ModuloStrength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		long[] numbers = new long[n];
		
		Map<Long,Long> map = new HashMap<Long, Long>();
		
		for(int i = 0 ;i <n;i++){
			numbers[i] = Long.parseLong(sc.next());
			Long modulo = numbers[i]%k;
			Long value = map.get(modulo);
			if(value==null){
				map.put(modulo, 1L);
			}else{
				map.put(modulo, ++value);
			}
		}
		
		Set<Map.Entry<Long, Long>> entries = map.entrySet();
		
		long sum = 0;
		for(Map.Entry<Long, Long> entry : entries){
			sum+= entry.getValue()* (entry.getValue()-1);
		}
		
		System.out.println(sum);
	}
}
