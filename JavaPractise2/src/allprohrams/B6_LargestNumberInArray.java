package allprohrams;

public class B6_LargestNumberInArray {

	public static void main(String[] args) {
		
		int[] Array = {1, 8, 9, 4, 10, 2};
		int max = Array[0];
		for(int arr:Array) {
			for(int i = 0; i<Array.length; i++) {
				if(Array[i]>max) {
					max = Array[i];
				}
			}
		}
		System.out.println(max);
		//OR
		int max1 = Array[0];
		for(int arr :  Array) {
			if(arr>max1) {
				max1 = arr;
			}
		}
		
		System.out.println(max1);
		

	}

}
