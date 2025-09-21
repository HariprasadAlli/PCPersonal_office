package smartInterviewsBasics;

public class OddEvenIndexString {
	public static void main(String args[]) {
		OddEvenIndexStringMethod();
	}

	public static void OddEvenIndexStringMethod() {
		String Name = "HariPrasad5";
		int N = 11;
		String Result = "";
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				System.out.print(Name.charAt(i));
			}
			
		}
	}

}
