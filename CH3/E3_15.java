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

public class E3_15 {

    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (Math.random() * 1000);
        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (Three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int Ld1 = lottery / 100;
        int Ld2 = (lottery / 10) % 10;
        int Ld3 = lottery % 10;

        // Get digits from guess
        int Gd1 = guess / 100;
        int Gd2 = (guess / 10) % 10;
        int Gd3 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        boolean allD = (Gd1 == Ld1 || Gd1 == Ld2 || Gd1 == Ld3) && (Gd2 == Ld1 || Gd2 == Ld2 || Gd2 == Ld3) && (Gd3 == Ld1 || Gd3 == Ld2 || Gd3 == Ld3);
        boolean oneD = (Gd1 == Ld1 || Gd1 == Ld2 || Gd1 == Ld3) || (Gd2 == Ld1 || Gd2 == Ld2 || Gd2 == Ld3) || (Gd3 == Ld1 || Gd3 == Ld2 || Gd3 == Ld3);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: you win $12,000");
        } else if (allD) {
            System.out.println("Match all digits: you win $5,000");
        } else if (oneD) {
            System.out.println("Match one digit: you win $2,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
