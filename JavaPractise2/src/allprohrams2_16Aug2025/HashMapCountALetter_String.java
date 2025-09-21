package allprohrams2_16Aug2025;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountALetter_String {

	public static void main(String[] args) {
		char Target = 'l';
		int count = 0;
		Map<String, String> name = new HashMap<>();

		name.put("firstName", "Alli");
		String value = name.get("firstName");

		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == Target) {
				count++;
			}
		}
		
		
		System.out.println("Occurance of " + Target + " character is: " + count);
	}
//Use charAt() when just reading.
//Use toCharArray() when you need to modify, sort, or reuse the characters.
}
