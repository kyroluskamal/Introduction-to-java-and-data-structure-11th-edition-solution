
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
public class E2_20 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
        double balance = input.nextDouble();
        double annualInterest = input.nextDouble();
        
        System.out.println("The interest is " + (float)(balance * (annualInterest/1200)));
    }
}
