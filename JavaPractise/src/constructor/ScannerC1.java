package constructor;

import java.util.Scanner;

public class ScannerC1 {
	
	public static void main(String args[]) {
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter Number");
	
	String username = myObj.nextLine();
	System.out.println("UserName is "+ username);

	

}
}