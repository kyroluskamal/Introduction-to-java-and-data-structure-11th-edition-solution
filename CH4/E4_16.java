/*
(Random character) Write a program that displays a random lowercase letter using
the Math.random() method.
 */

/**
 *
 * @author kyrolus
 */

public class E4_16 {
    public static void main(String[] args){
        
        char random = (char) (97 + Math.random() * 26);
        
        System.out.print("Your random lowercase letter is " + random);   
    }
}
