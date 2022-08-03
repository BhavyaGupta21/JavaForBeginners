// Static: Applicable for variables and methods
// We had 2 problems:
// 1) Every obj occupy certain amount of space in memory, and so do the variables
// 2) Objects are independent. So if modify a variable value in obj1, that will not reflect other objects variable values.

// Solution: Static variable is common across all the objects. So if static variable is modified, it will affect other objects.

// Remember:
// 1) Static methods can access only static stuff directly (Without creating any object).
// 2) Static methods can also access non-static stuff through object.
// 3) Non-static methods can access both static and non-static stuffs directly.

// System.out.println:
// In Java, there is a predefined class called System. In System class, there is a static variable called out  of type PrintStream. PrintStream is also a predefined dataType.
// Println, print etc. is a method that belongs to the PrintStream dataType just as length() method is used for printing length in String type.
// To access out variable, we use "System.out". Println/print is a method that prints the value inside it on the screen which we pass within double quotes. And hence, to access the method, we use System.out.println();

package staticVariablesAndStaticMethods;

public class StaticKeyword {

    static int a = 10; // Static variable
    int b = 20; // Non-static variable

    static void m1() { // Static method
        System.out.println("This is m1 - static method");

        StaticKeyword obj1 = new StaticKeyword(); // This is not a best practice, we should create objects in the main method
        System.out.println("Value of b is: " + obj1.b); // Since b is a non -static variable, we need an object to access it
    }

    void m2() { // Non-static method
        System.out.println("This is m2 - non static method");
    }

    void m3() {

        System.out.println("This is m3 - non static method");
        System.out.println("Value of a is: " + a); // Static variable
        System.out.println("Value of b is: " + b); // Non-static variable

        m1(); // Static method
        m2();// Non-static method
    }

    public static void main(String[] args) {

        System.out.println("Value of a is: " + a);
        m1();
        System.out.println();

        //System.out.println(b); // Incorrect, because b is non-static variable
        // m2(); Incorrect, because m2 is non-static method

        // If we want to access static variable and static method from another class, we can call directly using class name
        System.out.println("Value of a is: " + StaticKeyword.a);
        StaticKeyword.m1();
        System.out.println();

        StaticKeyword obj1 = new StaticKeyword();

        System.out.println("Value of b is: " + obj1.b); // Non-static variable through object
        obj1.m2(); // Non-static method through object
        System.out.println();

        obj1.m3(); // Main is static and m3 is non-static
    }
}
