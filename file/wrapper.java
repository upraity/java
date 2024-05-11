// Q8. Write a program to show wrapper classes.
public class wrapper{
    public static void main(String[] dj) {
        int intValue = 10;
        Integer integerValue = Integer.valueOf(intValue); 
        System.out.println("intValue: " + intValue);
        System.out.println("integerValue: " + integerValue);
        
        char charValue = 'A';
        Character charObject = Character.valueOf(charValue); 
        System.out.println("\ncharValue: " + charValue);
        System.out.println("charObject: " + charObject);
    }
}
