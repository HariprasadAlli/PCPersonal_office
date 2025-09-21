package exceptions;

public class Throw {
	
	static void checkAge(int age)
	{
		if(age>=18)
		{
			System.out.println("valid to vote");
		}
		else
		{
			System.out.println("not valid to vote");
		}
	}
	public static void main(String args[])
	{
		checkAge(15);
	}
	

}
