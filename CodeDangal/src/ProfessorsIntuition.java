import java.util.Scanner;
import java.util.TreeMap;


public class ProfessorsIntuition {
	private static float[] sumOfANumber = new float[1000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = Integer.parseInt(sc.next());
		init(sumOfANumber);
		while(tests-->0){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			TreeMap<Float,Integer> intutionCount = new TreeMap<Float,Integer>();
			for(int i=a;i<=b;i++){
				float measere = calculate(i);
				intutionCount.put(measere,i);
			}
			System.out.println(intutionCount.firstEntry().getValue());
		}
	}

	private static void init(float[] sumOfANumber2) {
		sumOfANumber2[1]=1;
		sumOfANumber2[2]=1;
		sumOfANumber2[3]=1;
	}

	private static Float calculate(int num) {
		return (float) (getSum(num)/num);
	}

	private static float getSum(int num) {
		float sum =0;
		if(sumOfANumber[num]!=0)
			return sumOfANumber[num];
		for(int i=num/2;i>=1;i--){
			if(num%i==0){
				sumOfANumber[num] += getSum(i)+i;
			}
		}
		sumOfANumber[num] = sum;
		return sum;
	}
}
