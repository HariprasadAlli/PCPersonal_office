package smartInterviewsBasics;

import java.util.Arrays;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
		SumOfNaturalNumbersMethod();
	}

    public static void SumOfNaturalNumbersMethod() {
        int N = 5;
        int sum = 0;
        for(int i = 1; i <= N; i++) {
        	sum = sum + i;
        }
        System.out.println(sum);
    }

}
