package objectOrientedProgramming;

public class EmployeeCLass {

    // Class variables
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
}
