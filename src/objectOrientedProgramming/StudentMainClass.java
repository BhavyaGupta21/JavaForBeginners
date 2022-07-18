// Diff between a method and a constructor
// 1) Constructor is a special type of method
// 2) Constructor is used for initializing the class variables
// 3) Constructor name should be same as class name
// 4) Constructor will not return any value (not even void)
// 5) Constructor will be invoked at the time of object creation

package objectOrientedProgramming;

public class StudentMainClass {

    public static void main(String[] args) {

        ClassVariablesStudent obj1 = new ClassVariablesStudent();
        // 1) Assign values using reference variable
        obj1.sid = 1010;
        obj1.sname = "John";
        obj1.grade = 'A';
        obj1.Display();
        System.out.println();

        // 2) Assign values by using method
        ClassVariablesStudent obj2 = new ClassVariablesStudent();
        obj2.getValues(1011, "David", 'A');
        obj2.Display();
        System.out.println();

        // 3) Assign values using constructor
        ClassVariablesStudentForConstructor obj3 = new ClassVariablesStudentForConstructor(1012, "Smith", 'B');
        obj3.Display();
    }
}
