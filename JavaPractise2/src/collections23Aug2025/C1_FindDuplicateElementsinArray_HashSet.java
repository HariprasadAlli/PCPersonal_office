package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C1_FindDuplicateElementsinArray_HashSet {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4);

		Set<Integer> set = new HashSet<>(list);
		List<Integer> listfinal = new ArrayList<>(set);

		System.out.println("No duplicates_HashSet" + listfinal);

		
		System.out.print("Duplicates: ");
		int[] array = { 1, 2, 2, 3, 3, 4 };
		

		for (int arr : array) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (arr == array[i]) {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(arr);
			}
		}

		System.out.println("only distinct duplicates: ");
		
		int[] array1 = {1, 2, 2, 3, 3, 4};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array1) {
            if (!seen.add(num)) { // if already exists in seen
                duplicates.add(num); 
            }
        }

        System.out.println(duplicates);
	}

}
