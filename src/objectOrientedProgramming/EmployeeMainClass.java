// Main() method in separate class

// We need to execute the class containing main method

package objectOrientedProgramming;

public class EmployeeMainClass {

    public static void main(String[] args) {

        // Creating object
        EmployeeCLass obj1 = new EmployeeCLass(); // It will create its own memory location and own copy of the variables and methods of the class
        obj1.eid = 101;
        obj1.ename = "Bob";
        obj1.sal = 15000.00;
        obj1.deptno = 10;
        obj1.job = "Manager";
        obj1.display();

        System.out.println();

        EmployeeCLass obj2 = new EmployeeCLass();
        obj2.eid = 102;
        obj2.ename = "John";
        obj2.sal = 25000.00;
        obj2.deptno = 20;
        obj2.job = "CEO";
        obj2.display();
    }
}
