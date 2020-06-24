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
public class E2_2 {
    public static void main(String[] argd){
        System.out.println("Enter the side of the equilateral triangel");
        Scanner input = new Scanner (System.in);
        double length = input.nextDouble();
        
        double area = (Math.sqrt(3)/4.0)* Math.pow(length, 2);
        double volume;
        volume = area * length;
        
        System.out.println("The area of the triangle = " + area + "and its volume = " + volume);
    }
}
