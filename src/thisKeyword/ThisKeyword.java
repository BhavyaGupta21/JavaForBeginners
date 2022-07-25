package thisKeyword;

public class ThisKeyword {

    int a, b; // These are instance variables or class variables

    void GetValues(int x, int y) { // These are the method variables or external variables

        a = x;
        b = y;
    }

    void GetValuesUsingThis(int a, int b) {
        this.a = a; // this.a and this.b points to the class variables and a and b are the method variables
        this.b = b;
    }

    void PrintValues() {
        System.out.println("Value of a is: " + a);
        System.out.println("Value of b is: " + b);
    }

    public static void main(String[] args) {

        ThisKeyword obj1 = new ThisKeyword();
        obj1.GetValues(100, 200);
        obj1.PrintValues();

        System.out.println();

        ThisKeyword obj2 = new ThisKeyword();
        obj2.GetValuesUsingThis(10, 20);
        obj2.PrintValues();
    }
}
