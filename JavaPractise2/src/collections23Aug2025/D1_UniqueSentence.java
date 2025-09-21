package collections23Aug2025;

import java.util.LinkedHashSet;

public class D1_UniqueSentence {

	public static void main(String[] args) {
		String sentence = "This is is Hari Hari Hari prasad";
		
		String[] words = sentence.split(" ");
		LinkedHashSet<String> uniquewords = new LinkedHashSet<String>();
		
		for(String wor : words) {
			if(!uniquewords.contains(wor)) {
				uniquewords.add(wor);
			}
		}
		System.out.println(uniquewords);
		
		String result = String.join(" ", uniquewords);
		System.out.println(result);

	}

}
