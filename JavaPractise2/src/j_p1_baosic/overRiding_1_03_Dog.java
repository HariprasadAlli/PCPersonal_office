package j_p1_baosic;

public class overRiding_1_03_Dog  extends overRiding_1_01_Animal {
	
	public void sound() {
		System.out.println("Dog barks: bow bow");
	}
	
	
	public static void main(String args[]) {
		overRiding_1_01_Animal myAnimal = new overRiding_1_01_Animal();
		overRiding_1_01_Animal myPig = new overRiding_1_02_pig();
		overRiding_1_01_Animal myDog = new overRiding_1_03_Dog();
		
		myAnimal.sound();
		myPig.sound();
		myDog.sound();
	}

}
