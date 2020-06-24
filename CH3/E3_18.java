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
public class E3_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package");
        double W = input.nextDouble();

        if (W > 0 && W <= 2) {
            System.out.println("The Shipping cost is 2.5");
        } else if (W > 2 && W <= 4) {
            System.out.println("The Shipping cost is 4.5");
        } else if (W > 4 && W <= 10) {
            System.out.println("The Shipping cost is 7.5");
        } else if (W > 10 && W <= 20) {
            System.out.println("The Shipping cost is 10.5");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
