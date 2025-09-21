jpackage exceptions;

public class TryCatch {
	
	public static void main(String args[]) {
		int i = 0;
	
	
	try {
		
		int b = 10/i;
		System.out.println("Correct");
	}
	
	catch(Exception e){
		System.out.println("No");
	}
	try {
		int a = 10* 15;
		System.out.println("1");
	}
	catch(Exception e) {
		System.out.println("0");
	}
	
	}
}
