
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
public class E3_19 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 edges of the triangle");
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();

        boolean valid = (t1+t2)>t3 && (t1+t3)>t2 && (t2+t3)>t1;
        if (!valid){
            System.out.println("The inputs are invalid");
        }else {
            System.out.println("The Perimeter = " + (t1 + t2 + t3));
        }
    }
}
