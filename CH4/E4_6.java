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
public class E4_6 {
    public static void main(String[] args){
        double angle_1 = Math.random()*(2*Math.PI);
        double angle_2 = Math.random()*(2*Math.PI);
        double angle_3 = Math.random()*(2*Math.PI);
    
        final double RADIUS = 40.0;
        
        double x1 = RADIUS * Math.cos(angle_1);
        double y1 = RADIUS * Math.sin(angle_1);
        double x2 = RADIUS * Math.cos(angle_2);
        double y2 = RADIUS * Math.sin(angle_2);
        double x3 = RADIUS * Math.cos(angle_3);
        double y3 = RADIUS * Math.sin(angle_3);
        
        System.out.print("the points are: (" + x1 + ", " + y1 +") (" +
               x2 + ", " + y2 +") (" + x3 + ", " + y3 +")");
        
        
    }
}
