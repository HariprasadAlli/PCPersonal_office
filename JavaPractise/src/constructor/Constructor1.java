/package constructor;

public class Constructor1 {
	
	int x;
	
	public Constructor1() {
		x = 5;
	}
	
	public static void main(String args[])
	{
		Constructor1 myObj = new Constructor1();
		System.out.println(myObj.x);
	}

}
