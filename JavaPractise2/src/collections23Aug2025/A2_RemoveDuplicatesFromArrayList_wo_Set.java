package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A2_RemoveDuplicatesFromArrayList_wo_Set {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(10, 20, 30, 10, 20, 40, 50, 30);
		List<Integer> uniquelist = new ArrayList<>();

		for (Integer arr : num) {
			if (!uniquelist.contains(arr)) {//In List, add() always succeeds (lists allow duplicates), so you must check with .contains() before adding.
				uniquelist.add(arr);
			}
		}

		System.out.println("Unique: " + uniquelist);

	}

}
