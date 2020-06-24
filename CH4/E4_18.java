/*
(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following characters are used to denote the majors:
I: Information Management
C: Computer Science
A: Accounting
Here is a sample run:
Enter two characters: I1
Information Management Freshman
Enter two characters: A3
Accounting Junior
Enter two characters: T3
Invalid input
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        char Major = Character.toUpperCase(s.charAt(0));
        char status = s.charAt(1);

        boolean isMajor = Major == 'I' || Major == 'C' || Major == 'A';
        boolean isStatus = status == '1' || status == '2' || status == '3' || status == '4';

        if (isMajor && isStatus) {
            switch (Major) {
                case 'I':
                    System.out.print("Information Management ");
                    break;
                case 'C':
                    System.out.print("Computer Science ");
                    break;
                case 'A':
                    System.out.print("Accounting ");
                    break;
                default:
                    break;
            }
            switch (status) {
                case '1':
                    System.out.print("freshman");
                    break;
                case '2':
                    System.out.print("sophomore");
                    break;
                case '3':
                    System.out.print("junior");
                    break;
                case '4':
                    System.out.print("senior");
                    break;
                default:
                    break;
            }
        } else {
            System.out.print("Invalid input");
            System.exit(0);

        }
    }
}
