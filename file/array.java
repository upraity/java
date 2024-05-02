// Q4. Write a program to create two deimensional array.
public class array {
    public static void main(String[] dj) {
        int[][] toDarray = new int[2][3];
        
        toDarray[0][0] = 1;
        toDarray[0][1] = 2;
        toDarray[0][2] = 3;
        toDarray[1][0] = 4;
        toDarray[1][1] = 5;
        toDarray[1][2] = 6;

        System.out.println("Two Dimentional Array: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(toDarray[i][j] + " ");
            System.out.println();
        }
    }
}
