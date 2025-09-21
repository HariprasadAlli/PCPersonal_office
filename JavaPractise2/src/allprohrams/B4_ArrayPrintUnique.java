package allprohrams;

public class B4_ArrayPrintUnique {

	public static void main(String[] args) {
		int Array[] = { 1, 1, 2, 3, 4, 4, 5, 5, 6 };
		int count;
		for (int arr : Array) {
			count = 0;
			for (int i = 0; i < Array.length; i++) {
					if (Array[i] == arr) {
						count++;
				}
			}
			if (count <= 1) {
				System.out.println(arr);
			}

		}

	}
}