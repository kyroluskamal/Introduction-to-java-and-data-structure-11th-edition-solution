/*
(Days of a month) Write a program that prompts the user to enter the year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month. If the input for month is incorrect, display a message
as presented in the following sample runs:
Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days
Enter a year: 2016
Enter a month: jan
jan is not a correct month name
 */

/**
 *
 * @author kyrolus
 */
import java.util.*;

public class E4_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String Month = input.nextLine();
        if (!Character.isUpperCase(Month.charAt(0))){
             System.out.print(Month + " is not a correct month name.");
        } else {
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();

       

        boolean isLeap = false;
        // Check if the year is a leap year
        if (year % 4 == 0 || year % 100 == 0) {
            isLeap = year % 400 == 0;
        }
        //check if the first character is a capital letter
            
            System.out.print(Month + " " + year + " has");
            
            switch (Month) {
                case "Jan": System.out.print("31");         break;
                case "Feb":
                    if (isLeap){
                        System.out.print("29 days");
                    }else System.out.print("28 days");
                    break;
                case "Mar": System.out.print("31 days");         break;
                case "Apr": System.out.print("30 days");         break;
                case "May": System.out.print("31 days");         break;
                case "Jun": System.out.print("30 days");         break;
                case "Jul": System.out.print("31 days");         break;
                case "Aug": System.out.print("31 days");         break;
                case "Sep": System.out.print("30 days");         break;
                case "Oct": System.out.print("31 days");         break;
                case "Nov": System.out.print("30 days");         break;
                case "Dec": System.out.print("31 days");         break;
            }
        } 
    }
}