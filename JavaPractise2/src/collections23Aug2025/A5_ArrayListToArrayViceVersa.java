package collections23Aug2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A5_ArrayListToArrayViceVersa {
		    public static void main(String[] args) {
		        
		        // 1. ArrayList → Array
		        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		        System.out.println("ArrayList: " + list);

		        // Convert ArrayList to Array
		        Integer[] array = list.toArray(new Integer[0]);
		        System.out.println("Array from ArrayList: " + Arrays.toString(array));

		        
		        
		        
		        
		        
		        
		        // 2. Array → ArrayList
		        String[] strArray = {"Java", "Selenium", "Testing", "API"};
		        System.out.println("Array: " + Arrays.toString(strArray));

		        // Convert Array to ArrayList
		        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
		        System.out.println("ArrayList from Array: " + strList);
		        
		        //we can print array list directly but not arrays
		    }
		}

