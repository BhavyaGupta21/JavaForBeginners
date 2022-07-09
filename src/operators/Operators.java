package operators;

// Operators is a symbol which perform certain action between 2 operands

// Arithmetic Operators --> + - * / %
// Relational Operators (Comparison Operators) --> == < > <= >= !=
// Logical Operators --> && || !
// Increment/Decrement Operators --> ++ --
// Assignment Operators --> =

public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // Here a & b are variables & 10, 20 are values

        int c = a + b; // a & b are 2 operands, + is operator

        // Arithmetic Operators --> + - * / %
        System.out.println("Sum of a and b is: " + (a + b)); // + is aso used a concatenation operator
        System.out.println("Diff of a and b is: " + (b - a));
        System.out.println("Mul of a and b is: " + (a * b));
        System.out.println("Div of a and b is: " + (b / a));
        System.out.println("Mod of a and b is: " + (a % b));

        // Relational Operators (Comparison Operators) --> == < > <= >= !=
        // Always returns boolean value
        System.out.println(a == b); // false
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b);// false
        System.out.println(a <= b);// true
        System.out.println(a != b); // true
        System.out.println();

        // Logical Operators --> && || !
        // Works between 2 logical/boolean values
        // x        y      x & y        x || y        !x
        // true     true   true         true          false
        // true     false  false        true
        // false    true   false        true          true
        // false    false  false        false
        boolean x = true;
        boolean y = false;

        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x); // false
        System.out.println(!y); // true
        System.out.println();

        // Increment/Decrement Operators --> ++ --
        a = a + 1; // Increment by 1
        System.out.println("Value of a is: " + a);
        a++;
        System.out.println("New value of a is: " + a);

        b = b - 1; // Decrement by 1
        System.out.println("Value of b is: " + b);
        b--;
        System.out.println("New value of b is: " + b);
    }
}
