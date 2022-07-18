// Java Methods: Block of code

// Method is a set of code which is referred to by name and can be called (invoked) at any point in a program simply by utilizing the method's name

// Method is a subprogram that acts on data and often returns a value

// Each method has its own name

//                Parameter/s        Returned value
// Case 1:        No parameter       No returned value
// Case 2:        No parameter       Returned value
// Case 3:        Parameter/s        Returned value
// Case 4:        Parameter/s        Returned value

package objectOrientedProgramming;

public class MethodsExampleCalculator {

    int x = 10;
    int y = 20;

    // Case 1: Not taking parameters and also not returning any value
    void sum() {
        System.out.println(x + y);
    }

    // Case 2: not taking parameters but returning value
    int sum1() {
        return (x + y);
    }

    // Case 3: Taking parameters, but not returning any value
    void sum2(int a, int b) {

        System.out.println(a + b);
    }

    // Case 4: Method is taking parameters and also returning value
    int sum3(int a, int b) {

        return (a + b);

    }

    public static void main(String[] args) {

        MethodsExampleCalculator obj1 = new MethodsExampleCalculator();
        obj1.sum(); // Case 1

        int sum = obj1.sum1(); // Case 2
        System.out.println("Sum is: " + sum);
        System.out.println(obj1.sum1()); // Case 2 other way

        obj1.sum2(100, 200); // Case 3

        System.out.println(obj1.sum3(500, 500)); // Case 4
    }
}
