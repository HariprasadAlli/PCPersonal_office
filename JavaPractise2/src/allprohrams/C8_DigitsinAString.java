package allprohrams;

public class C8_DigitsinAString {
	
	public static void main(String args[]) {
		String name = "hari1p2r3asad";
		String num = "";
		int sum = 0;
		 {
			for(char c : name.toCharArray()) {
				if( c >= '0' && c <= '9' ) {
					num = num + c + " ";
					sum = sum + c - '0';
					
//					OR
//					System.out.println(c);
				}
			}
		}
		
		System.out.println(num);
		System.out.println(sum);
		
	}

}
