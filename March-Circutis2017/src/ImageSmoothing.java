public class ImageSmoothing {
	public static void main(String[] args) {

		int[][] Gnew = new int[6][6];
		int[][] g = {{10,11,10,0,0,1},{9,10,11,1,0,1},{10,9,10,0,2,1},{11,10,9,10,9,11},{9,10,11,9,99,11},{10,9,9,11,10,10}};
		int[][] f = {{1,1,1},{1,1,1},{1,1,1}};
		for(int p =0;p <3;p++){
			for(int q = 0;q<3;q++){
				for(int i =0 ;i<6;i++){
					for(int j =0;j<6;j++){
						Gnew[i][j]+=g[i+p][j+q]*f[p][q];
					}
				}
			}
		}
	}
}
