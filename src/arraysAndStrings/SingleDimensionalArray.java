// Array: It is a collection of elements of same data type
// 2 Types of Array:
// 1) Single Dimensional Array
// 2) Two/Multidimensional Array

// 2 ways to declare array
// int a[] = new int[5]; Here int is dataType, a is variable name, new is a keyword, 5 is the size
// int []a = new int[5];


package arraysAndStrings;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int a[] = new int[5]; // Declared array with size 5, starting index is zero, last index is 4[n-1]

        // Storing or inserting values into array
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        int b[] = { 10, 20, 30, 40, 50 }; // Declare an array without specifying size

        System.out.println("Length of first array is: " + a.length); // Prints length or size of an array
        System.out.println();

        System.out.println(a[3]); // Reads a specific value
        System.out.println();

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println();

        for(int i = 0; i <= b.length - 1; i++) {

            System.out.println(b[i]);
        }

        System.out.println();

        // Read values using enhanced for loop
        for(int i: a) {
            System.out.println(i);
        }
    }
}
