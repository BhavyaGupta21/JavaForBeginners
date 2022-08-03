// Create class Calculation with the following methods:
// Class Name: Calculation

// int sum(int x, int y): Should accept two integer parameters and return sum of two numbers.
// int sum(int x, int y, inz): Should accept three integer parameters and return sum of three numbers.
// double sum(double x, double y): Should accept two double type parameters and return sum of two numbers.
// double sum(double x, double y, double z): Should accept three double type parameters and return sum of three numbers.

// Now, create object for Calculation clas "cal" then call different methods by passing different inputs.

package staticVariablesAndStaticMethods;

public class Assignment1 {

    public int sum(int x, int y) { // 1
        return (x + y);
    }

    public int sum(int x, int y, int z) { // 2

        return (x + y + z);
    }

    public double sum(double x, double y) { // 3

        return (x + y);
    }

    public double sum(double x, double y, double z) { //4

        return (x + y + z);
    }

    public static void main(String[] args) {

        Assignment1 obj1 = new Assignment1();

        System.out.println("Sum of two integers is: " + obj1.sum(100, 200)); // 1
        System.out.println();

        System.out.println("Sum of three integers is: " + obj1.sum(100, 200, 300)); // 2
        System.out.println();

        System.out.println("Sum of two double numbers is: " + obj1.sum(10.908, 20.98870)); // 3
        System.out.println();

        System.out.println("Sum of three double numbers is: " + obj1.sum(100.6544245, 200.97879, 87.08987)); // 4
    }
}
