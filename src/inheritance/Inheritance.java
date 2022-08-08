// Inheritance: Acquiring all the properties and behaviors from one class to another class is called inheritance.

// Parent/Base/Super class
// Child/Sub/Derived class

// 5 Types of Inheritance:
// 1) Single
// 2) Multilevel
// 3) Hierarchical
// 4) Multiple
// 5) Hybrid

// 1) Single Inheritance: If I have 2 classes say A and B, A is parent class and B is child class. If B acquires all the properties and behaviors of class A, it is called Single Inheritance.
// 2) Multilevel Inheritance: Here we can have more than 2 classes. Assume we have 3 classes, A, B and C. Here B is child class of A and C is child class of B. C acquires all the properties and behaviors of class A and B; B acquires all the properties and behaviors of class A. This type of inheritance is called Multilevel Inheritance.
// 3) Hierarchical Inheritance: Here we can have n number of subclasses. All the subclasses are independent and nowhere related. Assume we have 4 classes, A, B, C and D. Here A is the only parent class and rest are the child classes. B, C and D acquires all the properties and behaviors of class A. This is called Hierarchical Inheritance.
// 4) Multiple Inheritance: One child can have multiple parents. Assume we have 3 classes, A, B and C. A and B are parent class of C and class C is the only child class here. C has acquired all the properties and behaviors of class A and B. This is called Multiple Inheritance.
// 5) Hybrid Inheritance: Hybrid is a combination of Hierarchical and multiple Inheritance. Assume we have 4 classes, A, B,C and D. Here A is the parent class of B and C, that means B and C are derived classes of A. This is the upper portion and becomes the Hierarchical Inheritance. Below it, there will be one child class D, derived from classes B and C. This becomes multiple inheritance. Overall, B and C acquires all the properties and behaviors of class A and class D acquires all the properties and behaviors of class B and class C. This si called Hybrid Inheritance.

// If we want to acquire all the properties and behaviors from one class to another class, we use extends keyword.

// Single, Multilevel and Hierarchical Inheritance can be achieved using class and extends keyword, but we cannot achieve the rest two using this. For achieving these two we need to use interfaces instead of classes and implements keyword in place of extends.
package inheritance;

class A { // PArent class of B
    int a;

    void display() {
        System.out.println("Value of a is: " + a);
    }
}

class B extends A { // B becomes child class of A

    int b;

    void print() {
        System.out.println("Value of b is: " + b);
    }

}

public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        A obj1 = new A(); // Here we can access only the variable A and the method display() as this object is referring to class A
        obj1.a = 100;
        obj1.display();
        System.out.println();

        B obj2 = new B(); // Here we can access the variables a, b and methods display() and print() as B is the child class of A and contains all the properties of A along with B.
        obj2.a = 500; // A
        obj2.b = 200; // B
        obj2.display(); // A
        obj2.print(); // B

    }
}
