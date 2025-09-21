package j_p1_baosic;

public class overRiding_innerOuterClasses {

	int x = 10;
	
	class overRiding_innerOuterClassesforInner {
		
		int y = 5;
		
	}
	
	public static void main (String args[]) {
		overRiding_innerOuterClasses Obj = new overRiding_innerOuterClasses();
		overRiding_innerOuterClasses.overRiding_innerOuterClassesforInner Obj1 = Obj.new overRiding_innerOuterClassesforInner();
		System.out.println(Obj.x + Obj1.y);
	}
}
