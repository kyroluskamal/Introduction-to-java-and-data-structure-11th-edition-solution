/*
(Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0. For other input, display invalid grade. Here is a sample run:
Enter a letter grade: B
The numeric value for grade B is 3
Enter a letter grade: T
T is an invalid grade
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");

        String s = input.nextLine();
        char G = s.charAt(0);
        G = Character.toUpperCase(G);

        if (G >= 'A' && G <= 'D' || G == 'F') {
            System.out.print(" The numeric value for grade " + G + " is ");
            switch (G) {
                case 'A':
                    System.out.print("4");
                    break;
                case 'B':
                    System.out.print("3");
                    break;
                case 'C':
                    System.out.print("2");
                    break;
                case 'D':
                    System.out.print("1");
                    break;
                case 'F':
                    System.out.print("0");
                    break;
            }
        } else {
            System.out.print(G + " is an invalid grade");
        }
    }
}
