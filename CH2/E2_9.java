
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
public class E2_9 {
    public static void main (String[] args){
        System.out.println("Enter v0, v1, and t:");
        Scanner input = new Scanner (System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double time = input.nextDouble();
        
        double acceleration = (v1-v0)/time;
        
        System.out.println("The average acceleration is " + acceleration);
    }
}
