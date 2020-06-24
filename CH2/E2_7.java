
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
public class E2_7 {
    public static void main (String[] args){
        System.out.println("Enter the number of minutes:");
        Scanner input = new Scanner (System.in);
        long min = input.nextLong();
        long totalDays = (min/60) / 24;
        
        long years = totalDays/365;
        
        long reminderDays=totalDays%365;
        
        System.out.println(min + " minutes is approximately " + years + " years and " + reminderDays + " days");
    }
}
