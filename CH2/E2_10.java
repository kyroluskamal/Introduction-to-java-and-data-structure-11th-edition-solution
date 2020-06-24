
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
public class E2_10 {
    public static void main (String[] args){
        System.out.println("Enter the amount of water in kilograms:");
        Scanner input = new Scanner (System.in);
        double m = input.nextDouble();
        System.out.println("Enter the initial temperature:");
        double inTemp = input.nextDouble();
        System.out.println("Enter the final temperature:");
        double fTemp = input.nextDouble();
        
        double Q = m * (fTemp - inTemp) * 4184;
        
        System.out.println("The energy needed is " + Q);
    }
}
