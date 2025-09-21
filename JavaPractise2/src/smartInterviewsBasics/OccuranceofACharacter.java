package smartInterviewsBasics;

public class OccuranceofACharacter {
	
	public static void main(String args[]) {
		OccuranceChar();
	}
	
	public static void OccuranceChar() {
		String words = "Data Structures & Algorithms";
		char target = 'a';
		int count=0;
		
		
		for(int i = 0; i < words.length(); i++) {
			if(words.charAt(i)==target) {
				count++;
			}
		}
		System.out.println(count);
	}

}
