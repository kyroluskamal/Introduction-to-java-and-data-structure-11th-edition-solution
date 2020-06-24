
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
public class E2_14 {
     public static void main (String[] args){
        Scanner input = new Scanner (System.in);
       
        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();
        
        System.out.println("Enter height in inches:");
        double hight = input.nextDouble();
        
        System.out.println("BMI " + (pounds*0.45359237)/Math.pow(hight*0.0254,2));
    }
}
