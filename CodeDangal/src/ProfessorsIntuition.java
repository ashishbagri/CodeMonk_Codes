import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ProfessorsIntuition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.next());
		while(tests-->0){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			TreeMap<Float,Integer> intutionCount = new TreeMap<Float,Integer>();
			for(int i=a;i<=b;i++){
				intutionCount.put(calculate(i),i);
			}
			System.out.println(intutionCount.firstEntry().getValue());
		}
	}

	private static Float calculate(int num) {
		float sum =0;
		for(int i=1;i<=num/2;i++){
			if(num%i==0)
				sum+=i;
		}
		return (float) (sum/num);
	}
}