package inheritance;

class Parent {

    int a;
    void display() {
        System.out.println("Value of a is: " + a);
    }
}

class Child1 extends Parent {
    int b;
    void show() {
        System.out.println("Value of b is: " + b);
    }
}

class Child2 extends Parent {

    int c;
    void print() {
        System.out.println("Value of c is: " + c);
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Child1 obj1 = new Child1(); // We can access the properties of Parent class and Child1 class
        obj1.a = 100;
        obj1.b = 200;
        obj1.display();
        obj1.show();
        System.out.println();

        Child2 obj2 = new Child2(); // We can access the properties of Child2 class and Parent class
        obj2.a = 10;
        obj2.c = 20;
        obj2.display();
        obj2.print();

    }
}
