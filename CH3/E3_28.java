
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
public class E3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1’s center x-, y-coordinates, width, and height:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();
        
        System.out.println("Enter r2’s center x-, y-coordinates, width, and height:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();
        
        boolean outside = Math.abs(x1-x2)>=(w1/2+w2/2)&&Math.abs(y1-y2)>=(h1/2+h2/2);
        boolean inside = Math.abs(x1-x2)+w2/2 <=(w1/2)&&Math.abs(y1-y2)+h2/2<=(h1/2);
        boolean overlap = Math.abs(x1-x2)<(w1/2+w2/2)&&Math.abs(y1-y2)<(h1/2+h2/2);
        
        if (outside) {
            System.out.println("r2 neither inside noe overlap r1");
        } else if (inside){
            System.out.println("r2 is inside r1");
        }else if (overlap){
            System.out.println("r2 overlaps r1");
        }
    }
}
