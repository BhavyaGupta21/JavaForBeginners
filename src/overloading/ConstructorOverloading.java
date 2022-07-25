package overloading;

public class ConstructorOverloading {

    ConstructorOverloading(int a, int b) { // 1
        System.out.println("Sum of the numbers is: " + (a + b));
    }

    ConstructorOverloading(int a, double b) { // 2
        System.out.println("Sum of the numbers is: " + (a + b));
    }
    ConstructorOverloading(double a, int b) { // 3
        System.out.println("Sum of the numbers is: " + (a + b));
    }

    ConstructorOverloading(int a, int b, int c) { // 4
        System.out.println("Sum of the numbers is: " + (a + b + c));
    }

    public static void main(String[] args) {

        ConstructorOverloading obj1 = new ConstructorOverloading(10, 20, 30); // 4
        ConstructorOverloading obj2 = new ConstructorOverloading(10, 20); // 1
        ConstructorOverloading obj3 = new ConstructorOverloading(10, 20.67); // 2
        ConstructorOverloading obj4 = new ConstructorOverloading(10.90, 20); // 3
    }

}
