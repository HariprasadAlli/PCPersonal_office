package allprohrams2_16Aug2025;

public class NumberReverse {

	public static void main(String[] args) {
		int a = 12321;
		int temp = a;
		int rev = 0;
		
		while(temp>0) {
			int rem = temp%10;
			rev = rem+ rev*10;
			temp = temp/10;
		}

		if(rev==a) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not ");
		}
	}

}
