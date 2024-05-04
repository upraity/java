//  Q6. Write a program of Hybrid and Multiple Inheritance.
interface Swimmable {
    void swim();
}

interface Runnable {
    void run();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal implements Runnable {
    void bark() {
        System.out.println("Dog is barking...");
    }
    public void run() {
        System.out.println("Dog is running...");
    }
}

class Fish implements Swimmable, Runnable {
    public void swim() {
        System.out.println("Fish is swimming...");
    }

    public void run() {
        System.out.println("Fish cannot run...");
    }
}

public class inheritance2 {
    public static void main(String[] dj) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark(); 
        dog.run();  

        Fish fish = new Fish();
        fish.swim();  
        fish.run();   
    }
}
