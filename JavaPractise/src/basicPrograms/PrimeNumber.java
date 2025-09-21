package basicPrograms;

public class PrimeNumber {

	public static void findprimeNo(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("number is prime");
		} else {
			System.out.println("Not a prime");
		}

	}
	public static void main(String args[]) {
		findprimeNo(88);
		
	}
}
