package allprohrams2_16Aug2025;

public class TringReverse {

	public static void main(String[] args) {
		String name = "hari";
		String rev = "";
		

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		if (rev.equalsIgnoreCase(name)) {
			System.out.println("reversed name is a palindrome: " + rev);
		}

		else {
			System.out.println("reversed name is not a palindrome: " + rev);
		}
	}
}
