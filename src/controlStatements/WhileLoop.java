package controlStatements;

//Loop: Set of statement/s that can be repeated multiple times based on the condition

public class WhileLoop {

    public static void main(String[] args) {

        int i = 1; // Initialization

        // 1 to 10 numbers
        while(i <= 10) { // Condition

            System.out.println(i);
            i++; // Incrementation

        }
        System.out.println();

        // Even numbers between 1 and 10
        i = 2;
        while(i <= 10) {
            System.out.println(i);
            //i = i + 2;
            i += 2; // Short hand operator
        }

        System.out.println();

        // Odd numbers between 1 and 10
        i = 1;
        while(i <= 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println();

        // Print 1 to 10 in descending order
        i = 10;
        while(i > 0) {
            System.out.println(i);
            i--; // Decrement
        }
    }
}
