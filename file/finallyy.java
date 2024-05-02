// Q20. Write a program to show the use of finally statement.
import java.util.Scanner;

public class finallyy{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number:");
            int num = scanner.nextInt();
            System.out.print("Entered number: " + num);
        } 
        catch (Exception e){
            System.out.print("An error occurred: " + e.getMessage());
        } 
        finally{
            System.out.print("\nFinally block executed. Closing scanner...");
            scanner.close();
        }
    }
}
