package controlStatements;

public class JumpingStatements {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                break; // When condition becomes true, it comes out of the for loop
            }

            System.out.println(i);
        }

        System.out.println();

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                continue; // Skips the statements below and go to the next number
            }

            System.out.println(i);
        }

        System.out.println();

        // Skip odd numbers
        for(int i = 2; i <= 10; i++) {

            if(i == 3 || i == 5 || i == 7 || i == 9) {
                continue;
            }

            System.out.println(i);
        }
    }
}
