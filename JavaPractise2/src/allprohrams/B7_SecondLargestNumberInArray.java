package allprohrams;

import java.util.Arrays;

public class B7_SecondLargestNumberInArray {

	public static void main(String[] args) {
		int[] Array = { 1, 2, 5, 3, 8, 10, 4 };
		Arrays.sort(Array);

		System.out.println(Array[Array.length - 2]);

	}

}
