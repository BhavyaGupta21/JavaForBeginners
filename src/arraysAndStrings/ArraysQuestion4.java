// Write a Java program to print even and odd numbers in an array.

package arraysAndStrings;

public class ArraysQuestion4 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.print("Even numbers are: ");
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers are: ");
        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
