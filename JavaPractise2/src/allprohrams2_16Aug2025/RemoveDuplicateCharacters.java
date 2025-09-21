package allprohrams2_16Aug2025;

import java.util.HashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String name = "prasad";
		StringBuilder result = new StringBuilder();//StringBuilder allows you to modify the same object (append, insert, delete, etc.) without creating new objects.
		// why not string-Every time you use +=, Java creates a new String object in memory (old one discarded).
		//That is slow if you have many appends.
		HashSet<Character> seen = new HashSet<>();
		for(char ch: name.toCharArray()) {
			if(!seen.contains(ch)) {
				seen.add(ch);//ensures no duplicates- only remembers that this character was seen before
				result.append(ch);//actually adds the character to the final output string.
			}
		}
		System.out.println(result.toString());// tostring - Hand over the essay (not the notebook) for reading 
		/* Why result.toString() and not just result?

result is a StringBuilder object, not a String.

Printing result directly prints the object reference (like RemoveDuplicateCharacters$1@12345).

.toString() converts the content of the StringBuilder into a real String.

✅ That’s why System.out.println(result.toString()); is correct.*/
	
		

	}

}
