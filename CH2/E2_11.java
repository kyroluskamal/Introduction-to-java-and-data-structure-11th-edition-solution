
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
public class E2_11 {
    public static void main (String[] args){
        System.out.println("Enter the number of years:");
        
        
        Scanner input = new Scanner(System.in);
        int years = input.nextInt();
        double birth = (365*24*60*60)/7.0;
        double death = (365*24*60*60)/13.0;
        double imm = (365*24*60*60)/45.0;
        System.out.print("the population for each of the next five years = ");
        System.out.println(312032486+ (years* (int)(birth + imm - death)));
    }
}
