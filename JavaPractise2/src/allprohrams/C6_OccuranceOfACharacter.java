package allprohrams;

public class C6_OccuranceOfACharacter {
	
	public static void main(String args[]) {
		String name = "hariprasad";
		int count =0;
		for(int i =0; i<name.length(); i++) {
			if(name.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("count of a: " + count);
	}

}
	