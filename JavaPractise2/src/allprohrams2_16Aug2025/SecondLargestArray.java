package allprohrams2_16Aug2025;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main(String[] args) {
		int[] array = {10, 2, 4, 16, 15};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : array) {
			if(num > first) {
				second = first;
				first = num;
				
			}
			else if(num>second && num != first) {
				second = num;
			}
		}
		System.out.println("Second: " + second);
		
		

	}

}
