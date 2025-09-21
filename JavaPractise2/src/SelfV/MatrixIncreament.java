package SelfV;

public class MatrixIncreament {

	public static void main(String args[]) {
		int n = 4;
		int[][] array = new int[n][n];
		int c=1;

		for (int i = 0; i <= n - 1; i++) {

			for (int j = 0; j <= n - 1; j++) {
				array[i][j] = c*2;
				c++;

			}

		}
		for (int i = 0; i <= n - 1; i++) {

			for (int j = 0; j <= n - 1; j++) {
				System.out.print(" " + array[i][j] + "   ");
			}
			System.out.println();

		}

	}

}
