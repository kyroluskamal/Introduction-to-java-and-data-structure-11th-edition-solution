/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyrolus
 */
public class E3_16 {

    public static void main(String[] args) {
        // Generate random width and height
        int x = (int) ((Math.random() * (25 + 25)) - 25);
        int y = (int) ((Math.random() * (75 + 75)) - 75);
        
        // Display coordinate
        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println("with width 50 and height 150: (" + x + ", " + y + ")");
    }
}
