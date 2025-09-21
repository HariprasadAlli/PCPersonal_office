package allprohrams2_16Aug2025;

public class FindLargestWord {

	public static void main(String[] args) {
		String name = "This is Hari Prasad";
		String[] word = name.split(" ");
		String result = "";
		int max = 0;
		
		for (String wor : word) {
			if (wor.length() > max) {
				max = wor.length();
				result = wor;
			}
			
		}
		System.out.println("Length of word: " + max + " word is: " + result);
	}
}
