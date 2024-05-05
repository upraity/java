// Q19. Write a program of multiplication of two matrix.
public class matrix{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 6, 7};
        int[] resultArray = multiplyArrays(array1, array2);
        System.out.print("Result of multiplication: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
    public static int[] multiplyArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of equal length.");
            return null;
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        return result;
    }
}
