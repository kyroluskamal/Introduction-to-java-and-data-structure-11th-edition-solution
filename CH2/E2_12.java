
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
public class E2_12 {
    public static void main (String[] args){
        System.out.println("Enter speed and acceleration:");
        Scanner input = new Scanner(System.in);
        double v = input.nextDouble();
        double a = input.nextDouble();
        double length = Math.pow(v, 2)/(2*a);
        System.out.print("The minimum runway length for this airplane is " + length);
    }
}
