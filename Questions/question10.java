/*
    Q10. Use comparision operators to find out
    whether a given numnber is greater than the 
    user entered number or not.
*/

import java.util.*;
public class question10 {
    public static void main(String[] dj) {
        float a = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float a1 = input.nextFloat();
        if(a > a1){
            System.out.print("Your number is smaller than my number");
        }
        else if(a == a1){
            System.out.print("Your number is equal to the number");
        }
        else{
            System.out.print("Your number is greater than my number");
        }
    }
    
    
}
