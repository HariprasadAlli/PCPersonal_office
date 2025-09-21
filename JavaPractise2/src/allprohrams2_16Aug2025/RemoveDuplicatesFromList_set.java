package allprohrams2_16Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RemoveDuplicatesFromList_set {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(40, 20, 20, 30, 30, 10);
		
		// Using HashSet (does not maintain order)
		Set<Integer> uniqueNumbers = new HashSet<>(number);
		System.out.println(uniqueNumbers);// order not preserved
		
		// If you want to preserve the insertion order -> use LinkedHashSet
		Set<Integer> uniqueOrdered = new LinkedHashSet<>(number);
		System.out.println(uniqueOrdered);//preserves input order
		
		// If you want sorted order -> use TreeSet
		Set<Integer> uniqueSorted = new TreeSet<>(number);
		System.out.println(uniqueSorted); // sorted order
		
		Map<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        Map<Integer, String> uniqueSortedMap = new TreeMap<>(map);
		System.out.println(uniqueSortedMap); // sorted order
		
		

	}

}
