// Q7. Write a program to show the vector array.  
import java.util.Vector;

public class vector_array {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> vector = new Vector<>();
        
        // Add elements to the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        
        // Display the elements of the vector
        System.out.println("Elements of the vector:");
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }
}
