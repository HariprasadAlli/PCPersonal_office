package SelfV;

public class Matrix {
	
	public static void main(String args[]) {
		int n = 3;
		int[][] array = new int[n][n];
		for(int i=0; i<= n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				array[i][j] = 1;
			}
		}
		for(int i=0; i<= n-1; i++) {
			for(int j=0; j<=n-1; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
