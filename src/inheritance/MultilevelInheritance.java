package inheritance;

class A1 { // PArent class of B1
    int a;

    void display() {
        System.out.println("Value of a is: " + a);
    }
}

class B1 extends A { // B becomes child class of A1

    int b;

    void print() {
        System.out.println("Value of b is: " + b);
    }

}

class C1 extends B{ // C becomes child class of B1

    int c;

    void show() {
        System.out.println("Value of c is: " + c);
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        // Multilevel Inheritance
        A1 obj1 = new A1(); // Here we can access only the variable A1 and the method display() as this object is referring to class A1
        obj1.a = 100;
        obj1.display();
        System.out.println();

        B1 obj2 = new B1(); // Here we can access the variables a, b and methods display() and print() as B1 is the child class of A1 and contains all the properties of A1 along with B1.
        obj2.a = 500; // A1
        obj2.b = 200; // B1
        obj2.display(); // A1
        obj2.print(); // B1
        System.out.println();

        C1 obj3 = new C1(); // Acquires all the properties of class A1, B1 and C1 as it becomes the child class of B1 and B1 is the child class of A1.
        obj3.a = 10;
        obj3.b = 20;
        obj3.c = 30;
        obj3.display();
        obj3.print();
        obj3.show();

    }
}
