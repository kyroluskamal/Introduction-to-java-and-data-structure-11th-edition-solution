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
public class E3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a, b and c");
        double a = input.nextFloat();
        double b = input.nextFloat();
        double c = input.nextFloat();
        
        double discriminant = (b*b) - (4*a*c);
        
        double r1 = (-b+Math.pow(discriminant,0.5))/(2*a);
        double r2 = (-b-Math.pow(discriminant,0.5))/(2*a);

        
        if (discriminant>0){
            System.out.println("The equation has two roots " + (float)r1 + "  " + (float)r2);
        }else if (discriminant==0){
            System.out.println("The equation has two roots " + (float)r1);
        }else System.out.println("it has no real roots");
    }
}
