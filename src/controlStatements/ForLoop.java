package controlStatements;

public class ForLoop {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) { // Initialization is one time job and is the first step, second step is checking the condition, if the condition is true, set of statements gets executed which becomes the third step
            System.out.println(i); // Fourth step is the incrementation part and again after incrementation, fifth step becomes checking condition again, if condition is true, set of statements gets executed again which is the next step and then the loop is between the condition, increment and set of statements till the condition becomes false
        }

        System.out.println();

        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
}
