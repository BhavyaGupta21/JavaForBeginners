// Write a program to demonstrate constructor
// Create a class with 3 integer variables.
// Create a constructor to assign values into variables.
// Then create another method 'sum' to calculate sum of 3 numbers.
// Now, create object and call constructor by passing 3 integer values then call sum method.

package objectOrientedProgramming;

public class Question2 {

    int x;
    int y;
    int z;

    Question2(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    void Sum () {
        int sum = x + y + z;

        System.out.println("The sum of the three numbers is: " + sum);
    }

    public static void main(String[] args) {

        Question2 obj1 = new Question2(500, 600, 700);
        obj1.Sum();

    }
}
