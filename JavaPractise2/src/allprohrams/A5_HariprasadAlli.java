package allprohrams;

public class A5_HariprasadAlli {

	public static void main(String[] args) {
		String str = "Hari Prasad Alli";
		String[] word = str.split(" ");
		String rev = "";
		for (int i = str.length() - 6; i>4; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(word[0] + " " + rev + " " + word[2] ) ;


	}

}
//16 - 6 = 10