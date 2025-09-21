package smartInterviewsBasics;

public class DigitsinAString {

	public static void main(String args[]) {
		DigitsinAStringMethod();
	}

	public static void DigitsinAStringMethod() {
		String str = "123456786543"; // Input string
		boolean allDigits = true;

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) { // Check if character is not a digit
				allDigits = false;
				break; // Exit the loop as soon as a non-digit is found
			}
		}

		System.out.println(allDigits ? "Yes" : "No");
	}

}
