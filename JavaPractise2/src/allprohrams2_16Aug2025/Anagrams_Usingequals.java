package allprohrams2_16Aug2025;

import java.util.Arrays;

public class Anagrams_Usingequals {

	// to check 2 string are equal or not
	public static void main(String[] args) {
		String name1 = "Hari";
		String name2 = "HriA";

		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();

		char[] ch1 = name1.toCharArray();
		char[] ch2 = name2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("equals");
		} else {
			System.out.println("not");
		}
//		
//		if(ch1.equals(ch2)) {
//			System.out.println("equals");
//		}
//		else {
//			System.out.println("not");//ch1 and ch2 are arrays, and when you call .equals() directly on arrays, it does not compare the contents.Instead, it behaves like == (compares memory references).
//		}

		String name3 = "hari";
		String name4 = "hari";
		
		if(name3.equals(name4)) {
			System.out.println("equals");
		}
		else {
			System.out.println("not");
		}
	}

}
