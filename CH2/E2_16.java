
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
public class E2_16 {
     public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter the length of the side: ");
        double sideLength = input.nextDouble();
        
        double area = ((3*Math.pow(3, 0.5))/2)*Math.pow(sideLength,2);
        
        
        System.out.println("The area of the hexagon is " + area);
    }
}
