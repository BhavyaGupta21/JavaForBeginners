// Write a Java program to get a substring of a given string between two specified positions

package arraysAndStrings;

public class StringsQuestion4 {

    public static void main(String[] args) {

        String s = "Hello World!";

        int start_Position = 3;
        int end_Position = 9;

        System.out.println("Substring between " + start_Position + " and " + end_Position + " is: " + s.substring(start_Position, end_Position));
    }
}
