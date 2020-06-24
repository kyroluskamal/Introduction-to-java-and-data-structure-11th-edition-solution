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
public class E4_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter point 1 (latitude and longitude) in degrees:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter point 2 (latitude and longitude) in degrees:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        //converting the point 1 and 2 from degrees to radians
        double x1r = Math.toRadians(x1);
        double y1r = Math.toRadians(y1);
        double x2r = Math.toRadians(x2);
        double y2r = Math.toRadians(y2);
        
       
        double d = 6371.01 * Math.acos(Math.sin(x1r) * Math.sin(x2r) + Math.cos(x1r) * Math.cos(x2r) * Math.cos(y1r - y2r));
        System.out.printf("The distance between the two points is " + d + "km" );
    }
}