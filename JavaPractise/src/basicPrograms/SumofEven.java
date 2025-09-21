package basicPrograms;

public class SumofEven {
	public static void main(String args[]) {
		int num = 223456789;
		int rem;
		int sum=0;
		
		while(num>0) {
		rem = num%10;
		if(rem % 2 == 0)
		{
			sum = rem + sum;
		}
		num = num/10;
		}
		System.out.println(sum);
	}

}
