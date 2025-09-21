package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A1_RemoveDuplicatesFromArrayListwithSet{
	
	public static void main(String args[]) {
		
		Integer[] arr = {1, 5, 2, 3, 4, 1, 2, 5};
		List<Integer> list = Arrays.asList(arr);
		
		Set<Integer> set = new HashSet<>(list);
		
		List<Integer> listfinal = new ArrayList<>(set);
		
		System.out.println(listfinal);
		
	}

}
