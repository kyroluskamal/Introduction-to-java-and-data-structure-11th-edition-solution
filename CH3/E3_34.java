
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
public class E3_34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double onLine = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

         System.out.println("("+x2+" , " + y2 + ")" + ((onLine==0)?"is":"is not") + " on the line segment from ("+
                x0+" , " + y0 + ") to (" +x1+" , " + y1 + ")" );
    }
}
