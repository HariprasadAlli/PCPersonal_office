package constructor;

import java.util.Scanner;

public class Scanner3 {
	
	int P, T, R;
	
	float Anser = P * T * R/100f;
	
	public static void main(String args[])
	{
		System.out.println("Enter PTR");
		Scanner SC = new Scanner(System.in);
		P = SC.nextInt();
		T = SC.nextInt();
		R = SC.nextInt();
	}
	

}
