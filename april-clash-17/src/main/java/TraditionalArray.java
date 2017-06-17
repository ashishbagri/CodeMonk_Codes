import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang.SerializationUtils;
public class TraditionalArray {
/*	public static void main(String[] args) {

	}
	
	private void solve(){
		Scanner sc  = new Scanner(System.in);
		int tests = sc.nextInt();
		
		while(tests-->0){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int numbers[] = new int[n];
			int count = 0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					numbers[j] = i+1;
				}
				if(isHappy(numbers)){
					count++;
					count%=7000000000l;
				}
			}
		}
	}

	private boolean isHappy(int[] numbers) {
		if(numbers.length==1)
			return true;
		for(int i =0;i<numbers.length-1;i++){
			if(numbers[i]%numbers[i+1]==0 || numbers[i+1]%numbers[i]==0)
				return true;
		}
		return false;
	}
	
	private int[] permutationFinder(int[] numbers, int start, int end){
		
		if(numbers.length==1)
			return numbers;
		int perms[] = new int[numbers.length];
		int firstNumber = numbers[start];
		intperms = permutationFinder(numbers, 1, end);
		
		
	}*/
	
private final static String characters = "123";
	
	private static int length = characters.length();

	public static void main(String[] args) {
		List source = new LinkedList<Integer>();

		// form the source list that have all the possible positions
		for (int i = 0; i < length; i++) {
			source.add(i);
		}
		// create a target list for forming unique combinations
		List target = new LinkedList<Integer>();
		combine(source, target);
	}

	public static void combine(List<Integer>

	source, List

	target) {
		// break the recursion
		if (target.size() == length) {
			for (int i = 0; i < length; i++) {
				System.out.print(characters.charAt((Integer) target.get(i)));
			}
			System.out.println();
			return;
		}
		for (Integer position : source) {
			// form the target combination by selecting a position from the
			// source
			List

			reducedSource = (List

			) SerializationUtils.clone((LinkedList

			) source);
			reducedSource.remove(position);
			List

			combinedTarget = (List

			) SerializationUtils.clone((LinkedList

			) target);
			combinedTarget.add(position);
			combine(reducedSource, combinedTarget);
		}
		source.clear();
		target.clear();
	}
}
