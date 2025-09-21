package constructor;
import java.util.Scanner;

public class ScannerC2 {
	public static void main(String args[]) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter P, T, R");
	
	int P = sc.nextInt();
	int T = sc.nextInt();
	int R = sc.nextInt();
	
	float Answer = P * R * T / 100f;
	System.out.println(Answer);
	
	System.out.println("finish");
	sc.close();
	
	
	

}

}