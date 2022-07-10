// Write a Java program to count the number of digits of the number

package controlStatements;

public class Question4 {

    public static void main(String[] args) {

        int num = 867657;
        int count = 0;

        while(num != 0) {

            num = num / 10;
            count++;
        }

        System.out.println("Number of digits in the given num are: " + count);

    }
}
