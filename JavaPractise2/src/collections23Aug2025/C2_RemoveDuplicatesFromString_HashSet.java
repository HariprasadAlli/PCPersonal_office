package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C2_RemoveDuplicatesFromString_HashSet {

	public static void main(String[] args) {
		String name = "hariprasad";
		char[] ch1 = name.toCharArray();
		StringBuilder result = new StringBuilder();
		
		HashSet<Character> seen = new HashSet<Character>();
		
		for(char ch2:ch1) {
			if(seen.add(ch2)) {//In HashSet, add() itself tells you if the element is new or duplicate.
				result.append(ch2);
			}
			
		}
		System.out.println(result.toString());
		
		
		
		
	}

}
