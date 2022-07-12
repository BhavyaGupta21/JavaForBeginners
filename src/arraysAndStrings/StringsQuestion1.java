// Write a Java program to compare two strings, ignoring case differences

package arraysAndStrings;

public class StringsQuestion1 {

    public static void main(String[] args) {

        String s1 = "Hello world";
        String s2 = "HeLLo woRLD";

        boolean status = s1.equalsIgnoreCase(s2);

        if(status) {
            System.out.println("The given two strings are equal");
        }
        else {
            System.out.println("The given two strings are not equal");
        }
    }
}
