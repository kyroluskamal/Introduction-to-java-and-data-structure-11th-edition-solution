
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
public class E3_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 3 integers :");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        
        if (x>y && x>z){
            if (y>z){
                System.out.println("Enter 3 integers in descenting order :" + x + "  " + y + "  " + z);
            } else System.out.println("Enter 3 integers in descenting order :" + x + "  " + z + "  " + y);
        }else if (y>z && y > x){
            if (x>z){
                System.out.println("Enter 3 integers in descenting order :" + y + "  " + x + "  " + z);
            } else System.out.println("Enter 3 integers in descenting order :" + y + "  " + z + "  " + x);
        }else if (z>y && z > x){
            if (y>x){
                System.out.println("Enter 3 integers in descenting order :" + z + "  " + y + "  " + x);
            } else System.out.println("Enter 3 integers in descenting order :" + z + "  " + x + "  " + y);
        }
    }
}
