package allprohrams2_16Aug2025;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.*;

public class MergeTwoArrays_RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[(arr1.length + i)] = arr2[i];
		}

		for (int arr : arr3) {
			System.out.println(arr);
		}

		HashSet<Integer> seen = new HashSet<>();

		for (Integer arr : arr3) {
			if (!seen.contains(arr)) {
				seen.add(arr);
			}
		}

		System.out.println("Unique: " + seen);

		

	}

}
