
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
public class E3_31 {

    public static void main(String[] args) {
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        Scanner input = new Scanner(System.in);
        double convRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Enter the dollar amount: ");
                double dollars = input.nextDouble();
                System.out.println("$"+ dollars + " is " + (float) (dollars * convRate) + "yuan ");
                break;
            case 1:
                System.out.println("Enter the RMB amount: ");
                double RMB = input.nextDouble();
                System.out.println(RMB + " yuan is $" + (float) (RMB/convRate));
                break;
        }
    }
}
