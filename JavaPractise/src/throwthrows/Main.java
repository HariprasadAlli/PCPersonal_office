package throwthrows;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the contact details");
		String inputStr = sc.nextLine();
		String[] input = inputStr.split(",");
		
		ContactDetail cd = new ContactDetail(input[0], input[1], input[2], input[3], input[4]);
		System.out.println(cd);
		try
		{
			ContactDetailBO.validate(input[0], input[1]);
			System.out.println(cd.toString());
		}
		catch(DuplicateMobileNumberException e)
		{
			System.out.println(e);
			
		}
	}

}
