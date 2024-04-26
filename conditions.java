/*
 * There are two type of conditions statement
 * 1. If-Else
 * 2. Switch Case
 */
public class conditions {
    public static void main(String[] dj) {
        int age = 18;

        //if-else
        if(age>=18){
            System.out.println("Yes you can drive the vechile");
        }
        else{
            System.out.println("You can't drive the vechicle");
        }
        
        //switch-case
        switch(age){
            case 18: System.out.println("You can drive");
            default: System.out.println("You can;t drive the vechile");
        }
    }
}
