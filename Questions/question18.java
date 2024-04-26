/*
 * wap to find out whether a student is pass or 
 * fail if it required total 40% & at least 33% 
 * in each subject to pass Assume 3 subjects and it
 * takes morks as an input from the user.
 */
import java.util.*;
public class question18 {
    public static void main(String[] dj){
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st sub marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter your 2nd sub marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter your 3rd sub marks: ");
        m3 = sc.nextInt();

        float m = (m1 + m2 + m3)/3.0f;
        if(m >= 40 && m1>=33 && m2>=33 && m3>=33 ){
            System.out.println("You are pass, your percantage is: "+m);
        }
        else{
            System.out.println("You are fail, your percantage is: "+m);
        }
    }
}
