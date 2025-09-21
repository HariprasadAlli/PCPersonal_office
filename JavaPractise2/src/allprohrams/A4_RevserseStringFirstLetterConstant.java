package allprohrams;

public class A4_RevserseStringFirstLetterConstant {

	public static void main(String[] args) {
		String str = "Hari";
		String rev = "";
		for (int i = str.length() - 1; i > 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(str.charAt(0)+rev);


	}

}
