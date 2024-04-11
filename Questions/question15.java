/*
 * Wap to detect double and triple space in a string.
 */

public class question15 {
    public static void main(String[] dj) {
        String word = "Hello ,  How are your  my dear friends   ";
        System.out.println(word.indexOf(" "));
        System.out.println(word.indexOf("  "));
        System.out.println(word.indexOf("   "));
    }
}
