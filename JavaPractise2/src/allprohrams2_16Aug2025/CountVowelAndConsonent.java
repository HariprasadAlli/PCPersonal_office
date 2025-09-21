package allprohrams2_16Aug2025;

public class CountVowelAndConsonent {

	public static void main(String[] args) {
		String nam = "Hari";
		String name = nam.toLowerCase();
		int Vcount = 0;
		int Ccount = 0;

		for (char ch : name.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					Vcount++;
				} else {
					Ccount++;
				}
			} else {
				System.out.println("Enter valid Vowels and Consnants");
				return;// As soon as the program encounters a non-alphabet (like 1), it prints the
						// error and then return;
				// immediately stops the execution of the main method. and gives error
			}
		}

		System.out.println("vowels: " + Vcount + "Consonant: " + Ccount);

	}

}
