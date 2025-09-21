package allprohrams;

public class B8_MissingNumberInArray {

	public static void main(String args[]) {
		OneDArraySwapMethod();

	}

	public static void OneDArraySwapMethod() {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };
		int[] reverse = new int[3];

		for (int arr1 : array1) {
			System.out.print(arr1);
		}
		System.out.println();

		for (int arr2 : array2) {
			System.out.print(arr2);
		}
		System.out.println();

		reverse = array1;
		array1 = array2;
		array2 = reverse;

		for (int arrSA : array1) {
			System.out.print(arrSA);
		}
		System.out.println();
		for (int arrSB : array2) {
			System.out.print(arrSB);
		}
		System.out.println();

	}

}
