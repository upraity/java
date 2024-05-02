// Q1. Write a program to add two numbers. 
import java.util.Scanner;
public class first {
    public static void main(String[] dj) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum is: " +sum);
    }
}
