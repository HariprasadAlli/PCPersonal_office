package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4_CommonElementsBwTwoLists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> common = new ArrayList<>();
		
		for(int arr : list1) {
			if(list2.contains(arr)) {
				common.add(arr);
			}
		}
		System.out.println(common);

	}

}
