
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
public class E3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        
        System.out.println("Enter weight and price for package 2: ");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        
        float p1Ratio = (float)(p1/w1);
        
        float p2Ratio = (float)(p2/w2);
        
        System.out.println(p1Ratio==p1Ratio);
        
        if (p1Ratio<p2Ratio){
            System.out.println("Package 1 has a better price.");
        }else if (p1Ratio>p2Ratio){
            System.out.println("Package 2 has a better price.");
        }else if (p1Ratio==p2Ratio){
            System.out.println("Two packages have the same price.");
        }
    }
}
