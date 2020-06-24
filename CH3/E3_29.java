
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
public class E3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter circle1’s center x-, y-coordinates, and radius:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        
        System.out.println("Enter circle2’s center x-, y-coordinates, and radius:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        
        boolean inside = Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5) <=r1-r2;
        boolean overlap = Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)), 0.5) <=r1+r2;
        
        if (inside) {
            System.out.println("Circle2 is inside Circle1");
        } else if(overlap) {
            System.out.println("Circle2 overlaps Circle1");
        }else System.out.println("circle2 does not overlap circle1");
    }
}
