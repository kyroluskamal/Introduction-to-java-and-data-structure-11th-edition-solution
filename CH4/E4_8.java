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
import java.lang.*;
public class E4_8 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
           
        System.out.print("Enter a character: ");   
        String i = input.nextLine();
        
        char c = i.charAt(0);
        
        System.out.print("The ASCII code for character " + (int)c);
        
    }
}
