// We can assign values to the class variables in 3 ways:
// 1) By using reference variable, which we have seen in the Employee and EmployeeMain class
// 2) By using method
// 3) By using constructor

package objectOrientedProgramming;

public class ClassVariablesStudent {

    int sid;
    String sname;
    char grade;

    void Display() {

        System.out.println("Student ID is: " + sid + ", name is: " + sname + ", and grade is: " + grade);
    }

    void getValues(int id, String name, char g) {

        sid = id;
        sname = name;
        grade = g;
    }
}
