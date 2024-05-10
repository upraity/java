// Q12. Write a program using method overloading.
public class overloading{
    void display() {
        System.out.println("Method with no parameters");
    }
    // Method with one integer parameter
    void display(int num) {
        System.out.println("Method with one integer parameter: " + num);
    }
    // Method with two integer parameters
    void display(int num1, int num2) {
        System.out.println("Method with two integer parameters: " + num1 + ", " + num2);
    }
    
    public static void main(String[] dj) {
        overloading obj = new overloading();
        
        obj.display();          
        obj.display(10);        
        obj.display(20, 30);    
    }
}
