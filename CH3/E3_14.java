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

public class E3_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int HorT = (int)(Math.random()*2);
        
        System.out.println("Enter Your guess");
        int guess = input.nextInt();
        
        System.out.println((guess == HorT)?"Correct Guess" : "Incorrect Guess");
    }
}
