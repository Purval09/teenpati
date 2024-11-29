/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliverable;

import java.util.Scanner;

/**
 *
 * @author Purval
 */

public class DELIVERABLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TeenPattiGame game = new TeenPattiGame("Teen Patti");

        System.out.println("Enter number of players (2-4): ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter name for Player " + i + ": ");
            String name = scanner.nextLine();
            game.addPlayer(name, 100);
        }

        game.play();
    }
}
