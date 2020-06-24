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
public class E4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();
        
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        
        double Area = (n*Math.pow(s,2))/(4*Math.tan(Math.PI / n));
        System.out.printf("The area of the pentagon is %4.2f", Area);

    }
}