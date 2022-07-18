// Create a class containing following variables and methods
// Variables: SID, Sname, Sub1, Sub2, Sub3 (Student details and variables for 3 subjects)
// Methods:
// 1) GetStuData(): Takes student details SID and Sname as parameters and assign them to variables
// 2) GetStuMarks(): Takes student marks as parameters and assign them to Sub1, Sub2, Sub3
// 3) TotalMarks(): calculate total marks and print the student details with total marks
// Now create objects and call class methods

package objectOrientedProgramming;

public class Question1 {

    int sID;
    String sname;
    double sub1;
    double sub2;
    double sub3;

    void GetStuData(int id, String name) {
        sID = id;
        sname = name;
    }

    void GetStuMarks(double x, double y, double z) {
        sub1 = x;
        sub2 = y;
        sub3 = z;
    }

    void TotalMarks() {
        double tm = sub1 + sub2 + sub3;

        System.out.println("Student ID is: " + sID + ", name is: " + sname + ", and total marks are: " + tm);
    }

    public static void main(String[] args) {

        Question1 obj1 = new Question1();
        obj1.GetStuData(1010, "David");
        obj1.GetStuMarks(78.90, 98.87, 56.89);
        obj1.TotalMarks();
    }
}
