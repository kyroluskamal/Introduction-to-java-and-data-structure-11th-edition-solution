/*
(Binary to decimal) Write a program that prompts the user to enter binary digits
and displays its corresponding decimal value. Here are some sample runs:
Enter binary digits (0000 to 1111): 0111
The decimal value is 7
Enter binary digits (0000 to 1111): 1001
The decimal value is 9
Enter binary digits (0000 to 1111): 1100
The decimal value is 12
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_12{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        
        String hex = input.nextLine();
        char s = hex.charAt(0);
        
        if (Character.isLetter(s)&&Character.isLowerCase(s)){
            s = Character.toUpperCase(s);
        }
        
        System.out.print("The decimal value is ");
        switch (s){
            case '0': System.out.print("0000"); break;
            case '1': System.out.print("0001"); break;
            case '2': System.out.print("0010"); break;
            case '3': System.out.print("0011"); break;
            case '4': System.out.print("0100"); break;
            case '5': System.out.print("0101"); break;
            case '6': System.out.print("0110"); break;
            case '7': System.out.print("0111"); break;
            case '8': System.out.print("1000"); break;
            case '9': System.out.print("1001"); break;
            case 'A': System.out.print("1010"); break;
            case 'B': System.out.print("1011"); break;
            case 'C': System.out.print("1100"); break;
            case 'D': System.out.print("1101"); break;
            case 'E': System.out.print("1110"); break;
            case 'F': System.out.print("1111"); break;
            
        }   
    }
}
