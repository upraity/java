// Q13. Write a program for constructor overloading.
public class cus_over {
    // Constructor with no parameters
    cus_over() {
        System.out.println("Constructor with no parameters");
    }
    
    // Constructor with one integer parameter
    cus_over(int num) {
        System.out.println("Constructor with one integer parameter: " + num);
    }
    
    // Constructor with two integer parameters
    cus_over(int num1, int num2) {
        System.out.println("Constructor with two integer parameters: " + num1 + ", " + num2);
    }
    public static void main(String[] dj) {
        cus_over obj1 = new cus_over();          
        cus_over obj2 = new cus_over(10);        
        cus_over obj3 = new cus_over(20, 30);
    }
} 
