
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
public class E3_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a, b , c , d , e and f" );
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double D = (a*d) - (b*c);
        
        if (D == 0) {
            System.out.println("The equation has no solution");
        }else {
            double x = ((e*d)-(f*b))/D ;
            double y = ((a*f)-(c*e))/D ;
            System.out.println("x is " + (float)x + " and y is " + (float)y);
        } 
    }
}
