

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyrolus
 */
import java.util.Scanner;

public class E2_3 {
    public static void main (String[] args){
        System.out.println("Enter the distance by Meter");
        Scanner input = new Scanner (System.in);
        double meters = input.nextDouble();
        System.out.println("The " + meters + " Meter = " + meters * 3.2786 + " Feet");
    }
}
