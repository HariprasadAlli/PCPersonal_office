
package allprohrams2_16Aug2025;

public class lowerUpperCharactersCount {
	public static void main(String args[]) {
		String name = "HariPrasad";
		int Uppercount=0;
		int Lowercount=0;
		for(int i = name.length()-1; i>=0; i--) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				Uppercount++;
				
			}
			else if(Character.isLowerCase(ch)){
				Lowercount++;
			}
		}
		System.out.println(Uppercount +" :Upper count");
		System.out.println(Lowercount +" :Lower count");
	}

}
