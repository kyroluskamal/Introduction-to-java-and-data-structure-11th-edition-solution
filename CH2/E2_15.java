
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
public class E2_15 {
     public static void main (String[] args){
        Scanner input = new Scanner (System.in);
         
        System.out.println("Enter x1 and y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.println("Enter x2 and y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        double distance = Math.pow((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)), 0.5);
        System.out.println("The distance between the two points is " + distance);
    }
}
