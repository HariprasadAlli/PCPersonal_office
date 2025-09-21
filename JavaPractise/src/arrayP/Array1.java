package arrayP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array1 {
	
	public static void main(String args[])
	{
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("zHyundai");
		cars.add("Benz");
		cars.add("Maruthi");
		System.out.println(cars);
		cars.set(1, "Bull");
		System.out.println("Inserted Bull :"+cars);
		System.out.println(cars.get(1));
		cars.set(1, "volvo");
		System.out.println(cars);
		cars.remove(1);
		System.out.println(cars);
		System.out.println(cars.size());
		
		for(int i = 0; i<cars.size(); i++)
			System.out.println(cars.get(i));
		
		System.out.println("Gap");
		
		Collections.sort(cars);
		System.out.println(cars);
		Collections.sort(cars, Collections.reverseOrder());
		
		for(String i : cars)
			System.out.println(i);
		
		
				
	}

}
