package controlStatements;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 1;

        do { // Won't check the condition for the first time
            System.out.println(i); // This code will run at least once
            i++;
        } while (i <= 10);

        System.out.println();

        i = 20;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
