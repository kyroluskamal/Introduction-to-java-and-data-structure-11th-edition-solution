
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyrolus
 */
public class E2_6 {
    public static void main (String[] args){
        System.out.println("Enter a number between 0 and 1000:");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        
        int lastNo = number%10;
        int secondNo = (number/10)%10;
        int firstNo = (number/100);
       
        System.out.println("The multiplication of all digits in " + number + "is" + (firstNo*secondNo*lastNo));
    }
}
