
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
public class E2_4 {
    public static void main (String[] args){
        System.out.println("Enter the distance by Meter");
        Scanner input = new Scanner (System.in);
        double meters = input.nextDouble();
        System.out.println("The " + meters + " Meter = " + meters * 0.3025 + " ping");
    }
}
