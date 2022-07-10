package controlStatements;

public class IfElseCondition {

    public static void main(String[] args) {

        int age = 20;

        if(age >= 18) { // If condition is true, then the code below will run
            System.out.println("Eligible for vote"); // If block
        }
        else { // If condition is false, then the code below will run
            System.out.println("Not eligible for vote"); // Else block
        }
        // If you have single statement withing the blocks, then the curly braces are optional
    }
}
