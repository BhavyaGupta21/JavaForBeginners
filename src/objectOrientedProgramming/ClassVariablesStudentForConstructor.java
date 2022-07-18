// We can assign values to the class variables in 3 ways:
// 1) By using reference variable, which we have seen in the Employee and EmployeeMain class
// 2) By using method
// 3) By using constructor

package objectOrientedProgramming;

public class ClassVariablesStudentForConstructor {

    int sid;
    String sname;
    char grade;

    ClassVariablesStudentForConstructor(int id, String name, char g) { // Constructor

        sid = id;
        sname = name;
        grade = g;

    }

    void Display() { // Method

        System.out.println("Student ID is: " + sid + ", name is: " + sname + ", and grade is: " + grade);
    }
}
