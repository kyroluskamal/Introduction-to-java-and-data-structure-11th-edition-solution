
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
public class E3_32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, and p2:");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        boolean left = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0;
        boolean onLine = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) == 0;
        boolean right = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0;

        if (left) {
            System.out.println("p2 is on the left side of the line");
        } else if (right){
            System.out.println("p2 is on the right side of the line");
        }else if (onLine){
            System.out.println("p2 is on the same line");
        }
    }
}
