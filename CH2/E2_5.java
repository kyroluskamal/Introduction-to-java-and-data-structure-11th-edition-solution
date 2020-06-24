
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
public class E2_5 {
    public static void main (String[] args){
        System.out.println("Enter the subtotal and a gratuity rate:");
        Scanner input = new Scanner (System.in);
        double subTotal = input.nextDouble();
        double gratuity = input.nextDouble();
        
        gratuity = (gratuity/100.0)*subTotal;
        double total = gratuity+subTotal;
        System.out.println("The gratuity" + gratuity + " and total is $" + total);
    }
}
