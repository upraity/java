// Q11. Write a program to show the use of method overriding.
class Animal {
    void ms() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    // Method overriding
    void ms(){
        System.out.println("Dog barks.");
    }
}
public class over{
    public static void main(String[] dj) {
        // Creating objects of both parent and child classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.ms(); 
        dog.ms();    
    }
}
