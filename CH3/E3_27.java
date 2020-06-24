
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
public class E3_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x = input.nextDouble();

        double y = input.nextDouble();

        System.out.print("Point (" + x + " , " + y + ") is ");
        if (x <= 200.0 && y <= 100.0) {
            System.out.println("in the Triangle");
        } else if ((x > 200.0 && y <= 100.0) || (x <= 200.0 && y > 100.0) || (x > 200.0 && y > 100.0)) {
            System.out.println("not in the Triangle");
        }
    }
}
