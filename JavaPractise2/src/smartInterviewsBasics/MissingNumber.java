package smartInterviewsBasics;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String args[]) {
		MissingNumberMethod();
	}

    public static void MissingNumberMethod() {
        int[] array = {1, 3, 4, 2}; // Input array
        Arrays.sort(array); // Sort the array

        // Find the missing number from 1 to 5
        for (int i = 1; i <= 5; i++) { // Loop through numbers 1 to 5
            boolean found = false;
            for (int num : array) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Missing number: " + i);
            }
        }
    }
}


