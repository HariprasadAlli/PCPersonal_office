package allprohrams;

public class B51_ArraySortwoSortFn {

	public static void main(String[] args) {
		int Array[] = { 1, 6, 2, 8, 3 };
			for (int i = 0; i < Array.length; i++) {
				for(int j=0; j<Array.length-i-1; j++) {
					if(Array[j]> Array[j+1]) {
						int temp = Array[j];
						Array[j]= Array[j+1];
						Array[j+1] = temp;
						
					}
				}
			}
			for(int arr: Array) {
				System.out.println(arr);
			}
		}

	
}