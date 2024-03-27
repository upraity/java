//Q1. Write a program to find percentage of student marks.

import java.util.*;
public class question1 {
    public static void main(String dj[]) {
        Scanner s = new Scanner(System.in);

        //when we not know how many subjects are and we don't know array
        System.out.print("Enter your out of marks (like 100) per subject: ");
        int a = s.nextInt();
        System.out.print("Enter your marks in Ist subject: ");
        float a1 = s.nextInt();
        System.out.print("Enter your marks in 2nd subject: ");
        float a2 = s.nextInt();
        float per = (a1 + a2) / 2;
        System.out.println("Percentage is: " +per+ "%");
    }
}
