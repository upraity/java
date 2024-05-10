// Q2. Write a program to print the output of type casting.
public class type_casting {
    public static void main(String[] dj) {
        int intvalue = 10;
        double floatvalue = 20.5;

        double castfloat = (double) intvalue;
        int castint = (int) floatvalue;

        System.out.print("Casting int to float: " + castfloat);
        System.out.print("Casting float to int: " + castint);
    }
}
