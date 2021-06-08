import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ZeroSum {

    public static void main(String[] args) throws IOException{
        new ZeroSum().generatePowerSet("ABC");
       // System.out.println(new ZeroSum().generatePowerSet("ABC"));
    }

    private void solve(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            String in[] = br.readLine().split(" ");
            int count = 0;
            int sum = 0;
            Set<Integer> lookupTable = new HashSet<>();
            for (int i =0;i<n;i++){
                arr[i] = Integer.parseInt(in[i]);
                sum+=arr[i];
                if(sum==0 || !lookupTable.add(sum))
                    count++;
            }
            System.out.println(count);
        }
    }

    public int numberOfDigits(int num){
        return (int)Math.floor(Math.log(num))+1;
    }

    public boolean checkIfKthBitIsSet(int num, int k){
        return (num&(1<<k-1))!=0;
    }

    public boolean isPowerOfTwo(int num){
        return (num&(num-1))==0;
    }

    public int howManySetBits(int n){
        int result = 0;
        while(n>0){
            n&=(n-1);
            result++;
        }
        return result;
    }

    public int findOddElement(int[] nums){
        int ans = 0;
        for(int n : nums){
            ans^=n;
        }
        return ans;
    }

    public int[] findTwoOddElemts(int[] num){
        int xor = findOddElement(num);
        int set_bit = findRightMostsetBit(xor);

        int x=0;int y=0;
        for(int n : num){
            if((n&set_bit)!=0)
                x^=n;
            else
                y^=n;
        }
        return new int[]{x,y};
    }

    private int findRightMostsetBit(int xor) {
        return xor & (~(xor-1));
    }


    /**
     * total number of sets
     * 2^n
     * for ex : abc - 2^3 = 8
     * @param s
     */
    private void generatePowerSet(String s){


        int n = s.length();
        int powerSetCount = 1<<n;

        for(int i =0;i<powerSetCount;i++) {
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(s.charAt(j));
            System.out.println();
        }
        Integer.toBinaryString(3);
    }

}
