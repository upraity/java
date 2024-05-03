// Q5. Write a program to show single and multiple inheritance.
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is golden in color.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();  
        dog.bark(); 
        
        // Multilevel Inheritance
        Labrador labrador = new Labrador();
        labrador.eat();   
        labrador.bark();  
        labrador.color(); 
    }
}
