package allprohrams;

public class C3_CountStringswords {

	public static void main(String[] args) {
//		String name = "Hari prasad";
//		String[] words = name.split(" ");
//		System.out.println(words.length);// words count
//		System.out.println(name.length());// characters count include space
//		System.out.println(words[0].length()+words[1].length());// characters count not include space

		String name = "Hari  prasad";
		String[] words = name.trim().split("\\s+");
		System.out.println("Word count: " + words.length);
		System.out.println("Character count: " + name.length());
		for(String w:words) {
			System.out.println(w);
		}

	}

}
