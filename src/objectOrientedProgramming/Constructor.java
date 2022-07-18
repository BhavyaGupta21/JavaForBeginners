// There are two types of constructor
// 1) Default constructor
// 2) Parameterized constructor

// Method vs Constructor
// Method:
// 1) Method name can be anything
// 2) Method can return a value
// 3) Need to call method explicitly
// 4) Used for writing logic

// Constructor:
// 1) Constructor name must be same as class name
// 2) Constructor doesn't return a value
// 3) Automatically invoked at the time of object creation
// 4) Only used for initializing values

package objectOrientedProgramming;

public class Constructor {

    int x;
    int y;

    Constructor() { // Default constructor as it is not taking any values

        x = 10;
        y = 20;
    }

    Constructor(int a, int b) { // Parameterized constructor

        x = a;
        y = b;

    }

    void Display() {
        System.out.println("Sum is: " + (x + y));
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor(); // Constructor gets invoked as soon as the object is created, it invokes default constructor
        obj1.Display();

        Constructor obj2 = new Constructor(100, 200); // Invokes parameterized constructor
        obj2.Display();
    }
}
