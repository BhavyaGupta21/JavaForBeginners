// Class: Collection of variables and methods
// Object: It is an instance of a class
// Method: Block of code which contains certain logic

// Main() method can be present in the same class or even in the separate class
// If main method is present in the same class, then we cannot share that class

package objectOrientedProgramming;

public class OOPEmployee {

    // CLass variables
    int eid;
    String ename;
    double sal;
    int deptno;
    String job;

    void display() { // This is a method, i.e, a piece of code in Java, void is the return type. Return type is necessary while creating a method

        System.out.println("Employee ID is: " + eid);
        System.out.println("Employee name is: " + ename);
        System.out.println("Salary of the employee is: " + sal);
        System.out.println("Department number of the employee is: " + deptno);
        System.out.println("Designation of the employee is: " + job);
    }

    public static void main(String[] args) {

        // Creating object
        OOPEmployee obj1 = new OOPEmployee(); // It will create its own memory location and own copy of the variables and methods of the class
        obj1.eid = 101;
        obj1.ename = "Bob";
        obj1.sal = 15000.00;
        obj1.deptno = 10;
        obj1.job = "Manager";
        obj1.display();

        System.out.println();

        OOPEmployee obj2 = new OOPEmployee();
        obj2.eid = 102;
        obj2.ename = "John";
        obj2.sal = 25000.00;
        obj2.deptno = 20;
        obj2.job = "CEO";
        obj2.display();

    }
}
