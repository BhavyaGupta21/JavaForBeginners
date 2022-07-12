// Write a program to add two matrices

package arraysAndStrings;

public class ArraysQuestion6 {

    public static void main(String[] args) {

        int arr1[][] = { {45, 56}, {67, 99}, {67, 99} };
        int arr2[][] = { {67, 89}, {90, 87}, {54, 12} };

        int r1 = arr1.length;
        int r2 = arr2.length;

        int c1 = arr1[0].length;
        int c2 = arr2[0].length;

        if(r1 == r2 && c1 == c2) {

            int arr3[][] = new int[r1][c1];

            for(int i = 0; i < arr1.length; i++) {
                for(int j = 0; j < arr1[i].length; j++) {
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            System.out.println("The new array is: ");

            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c1; j++) {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Number of rows or columns do not match");
        }

    }
}
