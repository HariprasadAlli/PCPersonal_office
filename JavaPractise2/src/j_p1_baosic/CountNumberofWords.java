package j_p1_baosic;

public class CountNumberofWords {
	public static void main(String args[]) {
		String a = "one two three four";
		int countwords = a.split("\\s").length;
		System.out.println(countwords);
		
		
	}

}
