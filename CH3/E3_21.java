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

public class E3_21 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter year: (e.g., 2012):");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12:");
        int m = input.nextInt();
        if (m==1){
            m = 13;
            year=year-1;
        }else if (m==2){
            m = 14;
            year=year-1;
        }

        System.out.println("Enter the day of the month: 1-31:");
        int q = input.nextInt();
        int k = year%100;        
        int j = year /100;

        double h = ((q+(int)(26*(m+1)/10)+k+(int)(k/4)+(int)(j/4)+(5*j))%7);
        
        System.out.print("Day of the week is ");
        switch ((int)h){
            case 0: System.out.println("Saturday");break;
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday,");break;
            case 5: System.out.println("Thursday,");break;
            case 6: System.out.println("Friday");break;
        }
    }
}
