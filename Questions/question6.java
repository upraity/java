//Q.6 wap to check a number entered by user is integer or not.
import java.util.*;
public class question6 {
    public static void main(String[] args) {
        System.out.println("Checking the number is interger or not");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println(a.hasNextInt());
    }
}
