package constructor;

public class conspractise {
	String user1;
	String user2;
	public conspractise(String Name, String PWD) {
		user1 = Name;
		user2 = PWD;
	}
		
 public static void main(String args[]) {
	 conspractise Obj = new conspractise("hari", "uil");
	 System.out.println(Obj.user1 + Obj.user2);	
		
	}

}
