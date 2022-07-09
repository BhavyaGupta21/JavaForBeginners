// Write a java program to swipe two numbers

package operators;

public class Question3 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Value of a before swapping: " + a);
        System.out.println("Value of b before swapping: " + b);

        int c;

        // Swapping
        c = a;
        a = b;
        b = c;

        System.out.println("Value of a after swapping: " + a);
        System.out.println("Value of b after swapping: " + b);

    }
}
