package basicPrograms;

public class Factorial {
	public static void main(String args[]) {
		
		int sum = 5; 
		int fact=1;
		
		for(int i = sum; i>=1; i--) {
			fact = fact*i;
			
		}
		System.out.println(fact);
}
}
