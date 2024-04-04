// Q9. Write a program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

public class question9 {
    public static void main(String[] dj) {
        // using typecasting 

        //Encryption
        char grade = 'C';
        grade = (char)(grade + 10);
        System.out.println(grade);

        // Decryption 
        grade = (char)(grade - 10);
        System.out.println(grade);
    }
}
 
