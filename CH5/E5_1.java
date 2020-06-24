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

public class E5_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number and if you want to exit enter -1\n");

        int x = 0;
        while (x != -1) {
            System.out.print("Enter your score: ");
            x = input.nextInt();
            if (x==-1){
                System.out.print("No numbers are entered except 0 ");
            }else if (x >= 60) {
                System.out.print("You pass the exam.\n");
            } else if (x < 60) {
                System.out.print("You don't pass the exam.\n");
            } 
        }
    }
}
