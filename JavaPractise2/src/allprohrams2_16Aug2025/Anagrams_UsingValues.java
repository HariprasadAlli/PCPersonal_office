package allprohrams2_16Aug2025;

import java.util.Arrays;

public class Anagrams_UsingValues {

	public static void main(String[] args) {
		String name1 = "Hari";
		String name2 = "Hria";
		int sum1 = 0;
		int sum2 = 0;
		
		
		for(char ch : name1.toCharArray()) {
			sum1 += ch;
		}
		
		for(char ch : name2.toCharArray()) {
			sum2 += ch;
		}
		
		if(sum1 == sum2) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
		

	}

}
