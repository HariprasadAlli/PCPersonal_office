package smartInterviewsBasics;

public class SumOfSquares {
	public static void main(String args[]) {
		SumOfSquaresMethod();
	}

    public static void SumOfSquaresMethod() {
        int N = 20;
        int squares = 0;
        for(int i = 1; i <= N; i++) {
        	squares = squares + i*i;
        }
        System.out.println(squares);
    }

}
