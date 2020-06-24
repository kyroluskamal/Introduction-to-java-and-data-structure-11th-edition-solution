
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
public class E2_21 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter investment amount:");
        double invAmount = input.nextDouble();
       
        System.out.println("Enter annual interest rate in percentage:");
        double annInterset = input.nextDouble();
        
        System.out.println("Enter number of years:");
        int years = input.nextInt();
        
        float futureInv = (float)invAmount * (float) Math.pow((1+annInterset/1200), years*12);
        
        System.out.println("Future value is $" + futureInv);
    }
}
