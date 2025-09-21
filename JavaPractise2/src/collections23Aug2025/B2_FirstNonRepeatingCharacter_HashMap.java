package collections23Aug2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class B2_FirstNonRepeatingCharacter_HashMap {

	public static void main(String args[]) {
		String name = "Hariprasad";
		name = name.toLowerCase();
		int count = 1;

		char[] arr = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		for (Character key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println(key + " : " + map.get(key));
				break;
			}
		}
		
		

	}

}
