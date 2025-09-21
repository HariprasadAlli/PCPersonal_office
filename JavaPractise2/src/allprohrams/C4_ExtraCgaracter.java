package allprohrams;

public class C4_ExtraCgaracter {

	public static void main(String[] args) {
		String name1 = "Hari";
		String name2 = "ihari";
		int result = 0;
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		
		
		int sum1 = 0, sum2 = 0;

		for (char c : name1.toCharArray()) {
			sum1 += c;
		}

		for (char c : name2.toCharArray()) {
			sum2 += c;
		}

		char c1 = (char) (sum2 - sum1);
		System.out.println(c1);
		
		for(char ch : name1.toCharArray()) {
			result ^= ch;
		}
		
		for(char ch : name2.toCharArray()) {
			result ^= ch;
		}
		
		System.out.println((char) result);

	}

}
