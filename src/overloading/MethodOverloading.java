// Polymorphism is a concept and overloading is an approach by which we can achieve polymorphism
// Overloading is of 2 types:
// 1) Method
// 2) Constructor

// Overloading: Creating methods/constructors with the same name with different parameters

// Advantage:
// Saves memory
// Saves time

// Rules for differentiation
// 1) Number of parameters
// 2) Data type of parameters

// We can overload the main method, but we need to change the syntax; parameters must be changed

package overloading;

public class MethodOverloading {

    void add(int a, int b) { // 1

        System.out.println("Sum of a and b is: " + (a + b));
    }

    void add(int a, double b) { // 2

        System.out.println("Sum of a and b is: " + (a + b));
    }

    void add(double a, double b) { // 3

        System.out.println("Sum of a and b is: " + (a + b));
    }

    void add(int a, int b, int c) { // 4

        System.out.println("Sum of a, b and c is: " + (a + b + c));
    }

    public static void main(String[] args) {

        MethodOverloading obj1 = new MethodOverloading();
        obj1.add(10, 20); // 1
        obj1.add(899, 98.90); // 2
        obj1.add(90, 76, 89); // 4
        obj1.add(56.89, 90.8765); // 3
    }

}
