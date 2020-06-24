/*
(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode. Here is a sample run:
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;
public class E4_9 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
           
        System.out.print("Enter a character: ");   
        String i = input.nextLine();
        
        char c = i.charAt(0);
        
        System.out.print("The Unicode for the character " + (int)c);
        
    }
}
