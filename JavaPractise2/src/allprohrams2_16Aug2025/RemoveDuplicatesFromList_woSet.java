package allprohrams2_16Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromList_woSet {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10, 20, 30, 10, 20, 40, 50, 30);
		List<Integer> uniquelist = new ArrayList<>();

		for (Integer arr : num) {
			if (!uniquelist.contains(arr)) {
				uniquelist.add(arr);
			}
		}

		System.out.println("Unique: " + uniquelist);

	}

}
