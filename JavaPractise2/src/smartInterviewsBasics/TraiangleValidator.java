package smartInterviewsBasics;

public class TraiangleValidator {
	public static void main(String args[]) {
		TraiangleValidatorMethod(7.5f, 3, 5);
	}
	
	public static void TraiangleValidatorMethod(float Area, int Breadth, int Height) {
		
		if((Area * Breadth > Height) && (Breadth * Height > Area) && (Area * Height > Breadth)) {
			System.out.println("Its a Trainagle and Area is : " + Area);
		}
		
		else {
			System.out.println("Not a Trainagle dontworry please enter another vales");
		}
		
	}

}
