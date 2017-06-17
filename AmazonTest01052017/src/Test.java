import java.util.Scanner;

class Test{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        int[][] matrix = new int[row][column];
        for(int i =0;i<row;i++)
            for(int j=0;j<column;j++)
                matrix[i][j] = sc.nextInt();
                
        int rowNo = sc.nextInt();
        int rotationoCount = sc.nextInt();
        
        rotate(matrix[rowNo-1],rotationoCount);
        for(int i =0;i<column;i++){
            for(int j =1;j<row;j++){
                if(matrix[0][i]!=matrix[j][i]){
                    break;
                }
                System.out.println("INVALID");
                return;
            }
        }
        System.out.println("VALID");
    }
    
    private static void rotate(int[] num,int n){
        if(n<0)
        n= num.length-n;
        if(n>num.length)
            n=n%num.length;
        int[] result = new int[num.length];
        for(int i=0;i<n;i++)
            result[i] = num[num.length-n+i];
        int j=0;
        for(int i=n;i<num.length;i++){
            result[i] = num[j];
            j++;
        }
        System.arraycopy(result,0,num,0,num.length);
    }
}