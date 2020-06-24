/*
(Phone key pads) The international standard letter/number mapping found on the
telephone is shown below:
Write a program that prompts the user to enter a lowercase or uppercase letter and
displays its corresponding number. For a nonletter input, display invalid input.
Enter a letter: A
The corresponding number is 2
Enter a letter: a
The corresponding number is 2
Enter a letter: +
+ is an invalid input
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        String s = input.nextLine();
        char G = s.charAt(0);
        G = Character.toLowerCase(G);

        if (!Character.isLetter(G)) {
            System.out.print(G + " is an invalid input");
        } else {
            System.out.print(" The corresponding number is ");
            switch (G) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.print("2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.print("3");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.print("4");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.print("5");
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.print("6");
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.print("7");
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.print("8");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.print("9");
                    break;
            }
        }
    }
}
