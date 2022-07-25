package overloading;

public class OverloadMainMethod {

    // 1
    public void main(int x) { // we must not use the same definition as main method, that is, public static void main

        System.out.println("value of x is: " + x);
    }

    public void main(int x, int y) { // 2
        System.out.println("Sum of x and y is: " + (x + y));
    }

    public static void main(String[] args) { // Execution will always start from this main method

        OverloadMainMethod obj1 = new OverloadMainMethod();
        obj1.main(100); // 1
        obj1.main(100, 200); // 2
    }
}
