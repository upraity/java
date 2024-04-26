import java.util.Scanner; // it is a file to use input for user
public class user_input {
    public static void main(String dj[]) {
        // System.out.println("User Input");
        Scanner u = new Scanner(System.in);
        System.out.print("Enter 1st number: "); 
        int a = u.nextInt(); // it is use to store the value that give the user 
        System.out.print("Enter 2nd number: ");
        int b = u.nextInt(); // we use also float for store floating number => u.nextfloat()
        int sum = a + b;
        System.out.println("Sum of this number: "+sum);
        
        //check use input what is int, float, string.....
        System.out.println("Enter someting: ");
        boolean b1 = u.hasNextInt();
        System.out.println(b1);
        boolean b2 = u.hasNextFloat();
        System.out.println(b2);
        boolean b3 = u.hasNext();
        System.out.println(b3);   
        
        //for string
        String str = u.next(); // it use only read the first word 
        System.out.println(str); 

        String str1 = u.nextLine(); // it use read whole(all) line
        System.out.print(str1);
    }
}
