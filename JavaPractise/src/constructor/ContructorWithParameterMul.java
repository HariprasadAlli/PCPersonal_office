package constructor;

public class ContructorWithParameterMul {
	
	String ModelName;
	int ModelNum;
	
	public ContructorWithParameterMul(String Name, int Num)
	{
		ModelName = Name;
		ModelNum = Num;
	}
	
	public static void main(String args[])
	{
		ContructorWithParameterMul myObj = new ContructorWithParameterMul("Benz12", 2024);
		System.out.println(myObj.ModelName + " " + myObj.ModelNum);
	}
	
	

}
