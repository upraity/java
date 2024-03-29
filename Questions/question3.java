// Q3. wap to calculate CGPA  using marks of three subjects (out of 100)

import java.util.*;
public class question3 {
    public static void main(String dj[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter your marks of sub1: ");
        float a1 = a.nextFloat();
        System.out.print("Enter your marks of sub2: ");
        float a2 = a.nextFloat();
        System.out.print("Enter your marks in sub3: ");
        float a3 = a.nextFloat();
        float cgpa = (a1 + a2 + a3) / 3;
        System.out.println("CGPA is: "+cgpa);
    }
}
