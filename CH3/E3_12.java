
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
public class E3_12 {
      public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a three-digit integer:" );
        int num = input.nextInt();
        
        int x = num/100;
        int y = (num/10)%10;
        int z = num%10;
        
        if (x == z){
            System.out.println(num + " is a palindrome" );
        } else System.out.println(num + " is a not palindrome" );
    }
}
