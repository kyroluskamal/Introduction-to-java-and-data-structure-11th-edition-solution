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

public class E3_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates:");
        double x = input.nextDouble();

        double y = input.nextDouble();

        double distance = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);

        System.out.print("Point (" + x + " , " + y + ") is ");
        if (distance <= 10) {
            System.out.println("in the circle");
        } else {
            System.out.println("not in the circle");
        }
    }
}
