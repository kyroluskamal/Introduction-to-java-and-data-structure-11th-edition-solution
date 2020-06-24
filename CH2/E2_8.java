
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
public class E2_8 {
    public static void main (String[] args){
        System.out.println("Enter the time zone offset to GMT : ");
        Scanner input = new Scanner (System.in);
        long GMT = input.nextLong();
        long totalSeconds = System.currentTimeMillis()/1000;
        
        long currentSecond = totalSeconds%60;
        
        long totalMin = totalSeconds/60 ;
        
        long currentMin = totalMin%60;
        
        long totalHours = totalMin/60;
        long currentHours = totalHours%24;
        
        long GMTHours = currentHours + GMT;

        System.out.println("The current time is " + GMTHours + " : " + currentMin + " : " + currentSecond);
    }
}
