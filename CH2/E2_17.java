
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
public class E2_17 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter the temperature in Fahrenheit between -58�F and 41�F: ");
        double temp = input.nextDouble();
        
        System.out.println("Enter the wind speed (> = 2) in miles per hour: ");
        double wind = input.nextDouble();
        
        double tempWindChil = 35.74 + (0.6215*temp) - (35.75*Math.pow(wind,0.16)) + (0.4275*temp*Math.pow(wind,0.16));
        
        System.out.println("The wind chill index is " + tempWindChil);
    }
}