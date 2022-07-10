// Write a java program to print whether given number is positive or negative

package controlStatements;

public class Question1 {

    public static void main(String[] args) {

        int num = -30;

        if (num == 0) {

            System.out.println("Given number is zero");

        } else if (num >0) {
            System.out.println("Given number is positive");
        }
        else {
            System.out.println("Given number is negative");
        }

    }
}
