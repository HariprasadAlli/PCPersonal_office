package PractisePackage;

public class PractiseClass {
	
	static void areaT(int b, int h)
	{
		float areaT = 0.5f  * b * h;
		System.out.println(areaT);
	}
	
	static void areaR(int l, int b)
	{
		int areaR = l * b;
		System.out.println(areaR);
	}
	
public static void main(String args[])
{
	areaT(10,20);
	areaR(10,20);
}

}
