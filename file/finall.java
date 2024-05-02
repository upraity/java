// Q10. Write a program to show the use of final variable, final class, final method.
final class FinalClass {
    // Final variable
    final int finalVariable = 10;
    
    // Final method 
    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

public class finall{
    public static void main(String[] dj) {
        FinalClass finalObj = new FinalClass();
        
        System.out.println("Final variable value: " + finalObj.finalVariable);
        finalObj.finalMethod();
    }
}
