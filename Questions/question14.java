/*
 * Wap to fill in a letter template which looks like below:
 * letter = "Dear <|name|>, Thanks a lot"
 * Replace <|name|> with a string (some name)
 */

public class question14 {
    public static void main(String[] dj) {
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", "SabkaCode"));
    }
}
