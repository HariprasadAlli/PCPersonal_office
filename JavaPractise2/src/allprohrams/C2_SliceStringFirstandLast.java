package allprohrams;

public class C2_SliceStringFirstandLast {

	public static void main(String[] args) {
		String name = "Hari";

		for (int i = 0; i < name.length(); i++) {
			if (i != 0 && i != name.length() - 1) {
				System.out.println(name.charAt(i));
			}
		}
		// OR - below is better
		for(int i=1; i<name.length()-1; i++) {
			System.out.println(name.charAt(i));
		}
	}

}
