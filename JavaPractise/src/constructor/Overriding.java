// Parent class
class Zomato {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class Dog that overrides the sound method
class Customer extends Zomato {
    // Overriding the sound method in Dog class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}


// Main class to test method overriding
public class Zom_sup {
    public static void main(String[] args) {
    	Customer c1 = new Customer();
    	c1.sound();
    }
}
