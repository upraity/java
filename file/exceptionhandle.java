// Q18. Write a program using exception handling.
import java.util.Scanner;
public class exceptionhandle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter value of a:");
            int num1 = scanner.nextInt();
            System.out.print("Enter value of b:");
            int num2 = scanner.nextInt();
            int result = divide(num1, num2);
            System.out.print("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.print("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nClosing scanner...");
            scanner.close();
        }
    }
    
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
