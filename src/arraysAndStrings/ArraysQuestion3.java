// Define and array with some string values. Write a Java program to search specific string in an array

package arraysAndStrings;

public class ArraysQuestion3 {

    public static void main(String[] args) {

        String arr[] = new String[] { "Welcome", "to", "Java", "Working", "with", "arrays" };
        String s = "with";

        int flag = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == s) {
                System.out.println("Given string found in the array");
                flag = 1;
                break;
            }
        }

        if(flag == 0) {

            System.out.println("Given string not found in the array");
        }
    }
}
