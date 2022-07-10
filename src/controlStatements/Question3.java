// Write a Java program to display the multiplication table of 5

package controlStatements;

public class Question3 {

    public static void main(String[] args) {

        int num = 5;
        int mul;

        for(int i = 1; i <= 10; i++) {
            mul = num * i;
            System.out.println(num + " x " + i + " = " + mul);
        }

    }
}
