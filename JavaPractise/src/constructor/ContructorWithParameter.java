package constructor;

import java.io.Console;

public class ContructorWithParameter {
	
	int x;
	
	public ContructorWithParameter(int y)
	{
		x = y;
	}
	
	public static void main(String args[])
	{
		ContructorWithParameter myObj = new ContructorWithParameter(5);
		System.out.println(myObj.x);
	}

}
