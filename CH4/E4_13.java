/*
(Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant. For a nonletter input, display
invalid input. Here is a sample run:
Enter a letter: B
B is a consonant
Enter a letter: a
a is a vowel
Enter a letter: #
# is an invalid input
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");

        String s = input.nextLine();
        char L = s.charAt(0);

        if (!Character.isLetter(L)) {
            System.out.print(L + " is an invalid input");
        } else if (Character.isLetter(L)) {
            System.out.print(L);
            L = Character.toLowerCase(L);
            if (L == 'a' || L == 'e' || L == 'i' || L == 'o' || L == 'u') {
                System.out.print(" is a vowel ");
            } else {
                System.out.print(" is a consonant");
            }
        }
    }
}
