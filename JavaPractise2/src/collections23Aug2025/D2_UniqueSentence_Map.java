package collections23Aug2025;

import java.util.LinkedHashMap;
import java.util.Map;

public class D2_UniqueSentence_Map {

	public static void main(String[] args) {
		String sentence = "This is is Hari Hari Hari prasad";
		
		String[] word = sentence.split(" ");
		
		char[] ch = sentence.toCharArray();
		
		Map<String, Integer> map = new LinkedHashMap<>();
		
		int count = 1;
		for(char ch1:ch) {
			if(!map.containsKey(ch)) {
				map.put(ch, count);
			}
			
			
		}
		

	}

}
