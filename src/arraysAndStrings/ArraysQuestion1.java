// Write a Java program to calculate sum value of an array

package arraysAndStrings;

public class ArraysQuestion1 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        System.out.println("Sum of the elements of the array is: " + sum);
    }
}
