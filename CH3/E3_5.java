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

public class E3_5 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        System.out.println("Enter today�s day:" );
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:" );
        int aToday = input.nextInt();
        
        int futureD = (aToday%7)+today;
        
        System.out.print("Today is ");
        
        switch(today){
            case 0: System.out.print("Sunday "); break;
            case 1: System.out.print("Monday "); break;
            case 2: System.out.print("Tuesday "); break;
            case 3: System.out.print("Wendsday "); break;
            case 4: System.out.print("Thursday "); break;
            case 5: System.out.print("Friday "); break;
            case 6: System.out.print("Saturday "); break;
        }
        System.out.print("and the future day is ");

        switch(futureD){
            case 0: System.out.println("Sunday "); break;
            case 1: System.out.println("Monday "); break;
            case 2: System.out.println("Tuesday "); break;
            case 3: System.out.println("Wendsday "); break;
            case 4: System.out.println("Thursday "); break;
            case 5: System.out.println("Friday "); break;
            case 6: System.out.println("Saturday "); break;
        }
    }
}
