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
public class E2_1 {
    public static void main (String[] args){
        System.out.println("Enter the distance by Miles");
        Scanner input = new Scanner (System.in);
        double miles = input.nextDouble();
        System.out.println("The " + miles + " Mile = " + miles * 1.6 + "Km");
    }
}
