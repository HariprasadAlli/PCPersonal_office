package smartInterviewsBasics;

public class OnlyVowelsinString {

	public static void main(String args[]) {
		String input = "aeo"; // Input string
		System.out.println(containsOnlyVowels(input) ? "Yes" : "No");
	}

	public static boolean containsOnlyVowels(String str) {
		str = str.toLowerCase(); // Convert to lowercase for uniformity
		for (char ch : str.toCharArray()) {
			if ("aeiou".indexOf(ch) == -1) { // Check if character is not a vowel
				return false; // Return false if a non-vowel is found
			}
		}
		return true; // All characters are vowels
	}

}
