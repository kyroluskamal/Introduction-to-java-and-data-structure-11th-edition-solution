
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
public class E2_23 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter the driving distance in miles:");
        float distance = input.nextFloat();
       
        System.out.println("Enter miles per gallon:");
        float milesPG = input.nextFloat();
        
        System.out.println("Enter price per gallon:");
        float gPrice = input.nextFloat();
             
        System.out.println("The cost of driving is $" + distance/milesPG*gPrice);
    }
}
