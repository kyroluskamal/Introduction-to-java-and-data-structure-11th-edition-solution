
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
public class E3_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");

        int num = input.nextInt( );

        System.out.println("Is " + num + " divisible by 4 and 5? " + (num % 4 == 0 && num % 5 == 0));
        System.out.println("Is " + num + " divisible by 4 or 5? " + (num % 4 == 0 || num % 5 == 0));
        System.out.println("Is " + num + " divisible by 4 and 5? " + (num % 4 == 0 ^ num % 5 == 0));
    }
}
