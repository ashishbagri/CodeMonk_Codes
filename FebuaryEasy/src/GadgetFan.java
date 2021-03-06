import java.util.Scanner;

/**
 * iMagine yourself as a loyal fan of one popular company that creates all kind
 * of gadgets. After all of these years "that company" has created n n different
 * mobile phones, enumerated from 1 1 to n n and powering devices, enumerated
 * the same way. Due to the production policy, phones can be charged only by
 * devices with phone's version not exceeding charger's version. Moreover,
 * phone's and device's total version has to be equal or less than k k. For
 * example, if phone's version is a a and charger's is b b, then the phone can
 * be charged if a ≤ b a≤b and a + b ≤ k a+b≤k.
 * 
 * You are so loyal, you have already bought every device — all n n phones and n
 * n chargers! Moreover, you are fond of tea and taking photos with your cool
 * mug, but with your effort phone discharges in a couple of hours, and you have
 * to take a phone and a charger with you to the tea-shop and, of course, a pair
 * of different ones.
 * 
 * Your task is to find the number of days, you can visit the tea-shop with a
 * different pair of phone and a charger, which you haven't brought before, so
 * that you can charge the phone, according to the rules mentioned above.
 * 
 * Input format
 * 
 * The first line of input contains one integer t t — number of test cases.
 * 
 * For each case, single line contains two integers n n and k k — number of
 * mobile phones and versions' maximum sum, respectively.
 * 
 * Constraints
 * 
 * 1 ≤ t ≤ 10000 1≤t≤10000 1 ≤ n , k ≤ 2 ⋅ 10 9 1≤n,k≤2⋅109 Output format
 * 
 * For each case, output on a separate line a single integer — number of
 * different pairs of a phone and a charger, satisfying the rules described in
 * the statement.
 * 
 * SAMPLE INPUT 3 5 4 3 1 2 3 SAMPLE OUTPUT 4 0 2 Explanation Let the first
 * number in a pair be phone's version and second — charger's.
 * 
 * Then, for the first test case, there are four days, you can go to the
 * tea-shop with a different pair of phone and a charger, which you haven't
 * brought before, so that you can charge the phone, according to the rules
 * mentioned in the statement:
 * 
 * {2, 2} {1, 2} {1, 3} {1, 1} Next, for the second test case, versions' maximum
 * sum is 1, therefore no pair of a charger and a phone exists.
 * 
 * Finally, for the third test case, there are two days:
 * 
 * {1, 2} {1, 1} Time Limit: 2.0 sec(s) for each input file. Memory Limit: 256
 * MB Source Limit: 1024 KB
 * 
 * @author PaRV
 *
 */
public class GadgetFan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		while(tests-->0){
			int n = Integer.parseInt(sc.next());
			long k = Long.parseLong(sc.next());
			
			long[] nums = new long[n+1];
			for(int i =1;i<=n;i++)
				nums[i] = i;
			int days = 0;
			for(int i=1;i<k&&i<=n;i++){
				long a = nums[i];
				for(int j=1;j<=k-a&&i<=n;j++){
					long b = nums[j];
					if(a<=b)
						days++;
				}
			}
			System.out.println(days);
		}
	}

}
