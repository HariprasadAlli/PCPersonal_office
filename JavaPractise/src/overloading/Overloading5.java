package overloading;



public class Overloading5 {
    
    public void AnimalSound() {
        System.out.println("Animal sound classification");
    }
    
    static class Dog extends Overloading5 {
        public void AnimalSound() {
            System.out.println("Bow Bow");
        }
    }
    
    static class Cat extends Overloading5 {
        public void AnimalSound() {
            System.out.println("Meow Meow");
        }
    }

    public static void main(String args[]) {
        Overloading5 AS = new Overloading5();
        Overloading5 myDog = new Dog();
        Overloading5 myCat = new Cat();
        AS.AnimalSound();
        myDog.AnimalSound();
        myCat.AnimalSound();
    }
}

