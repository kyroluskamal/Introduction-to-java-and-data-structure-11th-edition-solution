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

public class E3_17 {

    public static void main(String[] args) {

        int com = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2):");

        int user = input.nextInt();

        System.out.print("The Computer is ");
        switch (com) {
            case 0: System.out.print("Scissor. ");break;
            case 1: System.out.print("Rock");     break;
            default:System.out.print("Paper");    break;
        }
        System.out.print("You are ");
        switch (user) {
            case 0: System.out.print("Scissor. "); break;
            case 1: System.out.print("Rock");      break;
            default:System.out.print("Paper");     break;
        }

        boolean win = (user == 2 && com == 1) || (user == 1 && com == 0) || (user == 0 && com == 2);

        if (com == user) {
            System.out.print("too. It is a draw");
        } else if (win) {
            System.out.print(". You won");
        } else {
            System.out.print(". You lose");
        }
    }
}
