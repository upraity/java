/*
Variable: A variable is store a value. This value can be change during the execution time.
ex- int n = 8;
     :.where int is a data-type
             n is a variable name
             8 is a value 
Rules for declaring a variable name
1. Variable not be start digit. ex- int 1arr; <- it is invalid
2. Variable name are case sensitive. ex- dj and DJ are different
3. In Variable space are not allowed. ex- int name value = 5; <- it is invalid
4. Valid : 
int name;
int name3;
int name_value;
*/

public class variable {
    public static void main(String dj[]){
        int b = 5;
        System.out.println(b);

        //addition of three number
        int x = 5, y = 10, z = 3;
        int sum = x + y + z;
        System.out.println(sum);
    }
}
