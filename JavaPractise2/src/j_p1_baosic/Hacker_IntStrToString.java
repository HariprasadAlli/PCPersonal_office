package j_p1_baosic;

public class Hacker_IntStrToString {
	public static void main(String args[]) {
		int num = 123;
		String str = Integer.toString(num);
		System.out.println(str+1);
		
		
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1 + 1);
		
		int num2 = 200;
		String str2 = Integer.toString(num2);
		
		if(num2==Integer.parseInt(str2)) {
			System.out.println("Good Job");
		}
		else{
			System.out.println("wrong Anser");
			}
		
	}
	

}
