package allprohrams;

public class C7_OddEvenIndexString {
	
	public static void main(String args[]) {
		String name = "hariprasad";
		String Even = "";
		
		for(int i = 0; i< name.length(); i++) {
			if(i%2 == 0) {
				Even = Even + name.charAt(i) + " ";
			}
		}
		System.out.println("Even: "+Even);
		for(int i = 0; i< name.length(); i++) {
			if(i%2 != 0) {
				System.out.println("Odd: " + name.charAt(i));
			}
			
		}
		
	}

}
