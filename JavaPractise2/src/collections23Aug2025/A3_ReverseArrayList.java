package collections23Aug2025;

import java.util.Arrays;
import java.util.List;

public class A3_ReverseArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		for(int i = list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}

	}

}
