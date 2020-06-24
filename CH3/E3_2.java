
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
public class E3_2 {
    public static void main(String[] args){
        int threeNo = (int)(System.currentTimeMillis() % 1000);
        int number1 = (int)(threeNo /100);
        int number2 = (int)((threeNo /10) % 10);
        int number3 = (int)(threeNo % 10);

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the result of " + number1 + " * " + number2 + " * " + number3 + " ?");
        double answer = input.nextFloat();
        if (answer == (number1 * number2 * number3)){
            System.out.println("You are Correct");
        }else {System.out.println("You are Wrong");}        
    }
}
