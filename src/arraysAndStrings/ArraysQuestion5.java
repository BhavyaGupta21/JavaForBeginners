// Write a Java program to find greatest and smallest element in an array

package arraysAndStrings;

public class ArraysQuestion5 {

    public static void main(String[] args) {

        int arr[] = {12, 24, 33, 47, 54, 65, 70, 85, 998, 100};
        int greatest = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        System.out.println("Greatest element of the array is: " + greatest);

        int smallest = greatest;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element of the array is: " + smallest);
    }
}
