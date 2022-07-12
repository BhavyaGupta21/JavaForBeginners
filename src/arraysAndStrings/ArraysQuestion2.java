// Write a Java program to search specific number in an array

package arraysAndStrings;

public class ArraysQuestion2 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 7;
        int flag = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == num) {
                System.out.println("Given number found in the array");
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println("Given number not found in the array");
        }
    }
}
