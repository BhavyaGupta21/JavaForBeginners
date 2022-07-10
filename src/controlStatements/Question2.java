// Write a Java program to find the greatest of 3 numbers

package controlStatements;

public class Question2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        
        if(a > b && a > c) {

            System.out.println("a is the greatest of 3 numbers");
        }
        else if(b > a && b > c) {

            System.out.println("b is the greatest of 3 numbers");
        } else {
            System.out.println("c is the greatest of 3 numbers");
        }

    }
}
