public class string_method {
    public static void main(String[] args) {
        String name = "SabkaCode";
        
        // some function
        int len = name.length();
        System.out.println(len); // it function store the length og the string 

        String lString = name.toLowerCase();
        System.out.println(lString); // it convert the string to lower alphabet 

        String uString = name.toUpperCase();
        System.out.println(uString); // it convert the string to upper alphabet 

        String n = "   Hello    ";
        System.out.println(n); // it print same as same
        System.out.println(n.trim()); // it remove all the extra spaces

        System.out.println(name.substring(2)); // in this line substring use to write the name after 2 letter
        System.out.println(name.substring(2,5)); // in this line substring use to write the name after a given number to a less given number
        
        System.out.println(name.replace('a','j')); // it replace all the same word that you gives 

        System.out.println(name.startsWith(n)); //  check and give boolean value if condition is right so gives true else false
        System.out.println(name.endsWith(n)); //  check and give boolean value if condition is right so gives true else false

        System.out.println(name.charAt(2)); // it gives those value that are indexed that place 
        System.out.println(name.indexOf("a")); // it search the string which is indexed in...
        // in this we can alse define ki kaha se searching start karni he 
        System.out.println(name.indexOf("a", 3));

        // same as for last index of
        System.out.println(name.lastIndexOf("e")); // it search the string which is indexed in...(last of the word)
        System.out.println(name.lastIndexOf("k", 5));

        System.out.println(name.equals("sabkacode")); // it ture give when name value is equal to the given value (sabkacode) else gives false {in this they can also  check case is upper or lowwer}
        System.out.println(name.equalsIgnoreCase("sabkacode")); // it same as but it cannot check the case of string

        //in the sentence we use quote so use escape sequence
        System.out.println("hello it is double quote \" use for...");
    }
}
