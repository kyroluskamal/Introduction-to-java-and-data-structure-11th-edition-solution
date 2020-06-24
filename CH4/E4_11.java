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

public class E4_11 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111):");
        
        String binary = input.nextLine();
        
        System.out.print("The decimal value is ");
        switch (binary){
            case "0000": System.out.print("0"); break;
            case "0001": System.out.print("1"); break;
            case "0010": System.out.print("2"); break;
            case "0011": System.out.print("3"); break;
            case "0100": System.out.print("4"); break;
            case "0101": System.out.print("5"); break;
            case "0110": System.out.print("6"); break;
            case "0111": System.out.print("7"); break;
            case "1000": System.out.print("8"); break;
            case "1001": System.out.print("9"); break;
            case "1010": System.out.print("10"); break;
            case "1011": System.out.print("11"); break;
            case "1100": System.out.print("12"); break;
            case "1101": System.out.print("13"); break;
            case "1110": System.out.print("14"); break;
            case "1111": System.out.print("15"); break;
            
        }
        
        
    }
}
