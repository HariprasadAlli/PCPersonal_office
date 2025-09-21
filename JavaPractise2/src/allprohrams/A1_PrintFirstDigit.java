package allprohrams;

public class A1_PrintFirstDigit {

	public static void main(String[] args) {
		int a = 123;
		int temp = a;

		while (temp > 10) {
			temp = temp / 10;
		}

		System.out.println(temp);

	}

}
