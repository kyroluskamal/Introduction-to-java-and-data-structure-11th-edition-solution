
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
public class E3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        
        //solving equation one
        double equation1_x = y1-y2;//a in the 2 * 2 matrix
        double equation1_y = x1-x2;//b in the 2 * 2 matrix
        double afterEqual1 = (y1 - y2)*x1 - (x1 - x2)*y1;//e in the 2 * 2 matrix

        //solving equation one
        double equation2_x = y3-y4;//c in the 2 * 2 matrix
        double equation2_y = x3-x4;//d in the 2 * 2 matrix
        double afterEqual2 = (y3 - y4)*x3 - (x3 - x4)*y3;//f in the 2 * 2 matrix
        
        double a = equation1_x, b=equation1_y,c=equation2_x, d =equation2_y, e = afterEqual1, f= afterEqual2;
        
        double D = (a*d) - (b*c);
        
        if (D == 0) {
            System.out.println("The two lines are parallel");
        }else {
            double x = ((e*d)-(f*b))/D ;
            double y = ((a*f)-(c*e))/D ;
            System.out.println("The intersecting point is at (" + (float)x + " , " + (float)y + ")");
        }
    }
}
