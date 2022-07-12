// int a[][] = int[3][2]; Here 3 represents number of rows and 2 represents number of columns in each row
// int [][]a = int[3][2];

package arraysAndStrings;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int a[][] = new int[3][2];

        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        int b[][] = { {10, 20}, {30, 40}, {50, 60}, {70, 80} };

        System.out.println("Number of rows in first array: " + a.length);
        // To find number of columns, we should specify at least one row and then we need to find how many columns are there in that particular row
        System.out.println("Number of columns in the first array: " + a[0].length);

        System.out.println();

        // Nested For loop
        for(int i = 0; i < a.length; i++) { // Outer loop

            for(int j = 0; j < a[i].length; j++) { // Inner loop

                System.out.println(a[i][j]);

            }
        }
        System.out.println();

        // Enhanced for loop
        for(int r[]: b) // r contains the complete row which is int type

            for(int i: r) {
                System.out.println(i);
            }
    }
}
