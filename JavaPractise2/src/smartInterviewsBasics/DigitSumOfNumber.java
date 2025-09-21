package smartInterviewsBasics;

public class DigitSumOfNumber {

	public static void main(String args[]) {

		DigitSumOfNumberMethod();
	}

	public static void DigitSumOfNumberMethod() {
		int num = 161;
		int rem;
		int sum = 0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);

	}

}
