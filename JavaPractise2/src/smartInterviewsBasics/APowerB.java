package smartInterviewsBasics;

import javax.naming.spi.DirStateFactory.Result;

public class APowerB {

	public static void main(String args[]) {
		APowerBMethod();
	}

	public static void APowerBMethod() {
		int A = 2;
		int B = 5;
		int Result = 1;
		for (int i = 1; i <= B; i++) {
			Result = Result * A;
		}
		System.out.println(Result);
	}
}