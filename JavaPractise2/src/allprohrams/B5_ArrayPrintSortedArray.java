package allprohrams;

import java.util.Arrays;

public class B5_ArrayPrintSortedArray {

	public static void main(String[] args) {
		int Array[] = { 1, 8, 5, 6, 2,3 };
		Arrays.sort(Array);
		for(int arr:Array) {
			System.out.println(arr);
		}

	}
}