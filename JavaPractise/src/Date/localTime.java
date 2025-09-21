package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localTime {
	
	public static void main(String args[])
	{
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		
		LocalTime myObj1 = LocalTime.now();
		System.out.println(myObj1);
		
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println(myObj2);
	}

}
