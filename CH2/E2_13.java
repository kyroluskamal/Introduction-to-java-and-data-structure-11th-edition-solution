/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;
public class E2_13 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the monthly saving amount:");
        double saving = input.nextDouble();
        
        double fMonth = saving * (1+0.003125);
        double sMonth = (saving + fMonth) * (1+0.003125);
        double tMonth = (saving + sMonth) * (1+0.003125);
        double fourthMonth = (saving + tMonth) * (1+0.003125);
        double fifthMonth = (saving + fourthMonth) * (1+0.003125);
        double sixMonth = (saving + fifthMonth) * (1+0.003125);
        
        System.out.println("After the first month, the account value is " + fMonth );
        System.out.println("After the Second month, the account value is " + sMonth);
        System.out.println("After the third month, the account value is " + tMonth);
        System.out.println("After the fourth month, the account value is " + fourthMonth);
        System.out.println("After the fifth month, the account value is " + fifthMonth);
        System.out.println("After the sixth month, the account value is " + sixMonth);
    }
}
