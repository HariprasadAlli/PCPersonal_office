package allprohrams;

public class A2_ReverseNumber {

	public static void main(String args[]) {

		int a = 123;
		int rev = 0;
		int temp = a;
		while (temp > 0) {
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}

		System.out.println(rev);
	}

}
