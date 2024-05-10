// Q9. Write a program to show the use of static method, static variable, static class.
public class staticc{
    // Static variable
    static int staticVariable = 100;
    
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
     //static class
    static class staticlass {
        void display() {
            System.out.println("This is a method of the static class.");
        }
    }
    public static void main(String[] dj) {
        System.out.println("Accessing static variable: " + staticVariable);
        staticMethod();
        staticlass nestedObj = new staticlass();
        nestedObj.display();
    }
}
