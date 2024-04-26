/*
    Define: 
    Operators are used to perform operations on variables and values.
    7 + 10 = 17
    :. where 7  -> operand
             +  -> operator
             17 -> result
    
    Types of operators:
    1. Arithmetic Operator(+, -, *, /, %, ++, --)
    2. Assignment Operator(=, +=, -=, *=, /=, %=)
    3. Comparison Operator(==, <=, >=)
    4. Logical    Operator(&&, ||, !)
    5. Bitwise    Operator(&, |)
*/
public class operator {
    public static void main(String dj[]) {
        System.out.println("Operators");
        int a = 5,b = 2,c;
        System.out.println("Arithmetic Operators");
        c = a + b;
        System.out.println("Addition: "+c);
        c = a - b;
        System.out.println("Subtraction: "+c);
        c = a * b;
        System.out.println("Multiplication: "+c);
        c = a / b;
        System.out.println("Divide: "+c);
        c = a % b;
        System.out.println("Mod: "+c);
        c = a++;
        System.out.println("Increament: "+c);
        c = a--;  
        System.out.println("Decrement: "+c);      

        System.out.println("Assignment Operators");
        c = a;
        System.out.println(c);
        c += a;
        System.out.println(c);
        c -= a;
        System.out.println(c);
        c *= a;
        System.out.println(c);
        c /= a;
        System.out.println(c);
        c %= a;
        System.out.println(c);
    
        System.out.println("Camparison Operators");
        System.out.println(c == a);
        System.out.println(c >= a);
        System.out.println(c <= a);

        System.out.println("Logical Operators");
        System.out.println(c > a && c == 5);
        System.out.println(c < a || c == 5);

        System.out.println("Bitwise Operators");
        System.out.println(c & a);
        System.out.println(c | a);
    }
}
