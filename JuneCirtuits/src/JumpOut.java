import java.util.*;


class JumpOut {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int count=0;
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(nums[i]>=(n-i)){
                count= i+1;
            break;
            }
        }
        System.out.println(count);
    }
}