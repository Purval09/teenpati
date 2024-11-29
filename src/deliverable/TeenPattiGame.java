
package deliverable;

import java.util.ArrayList;
import java.util.Scanner;

public class TeenPattiGame extends Game {
    private final ArrayList<TeenPattiPlayer> players = new ArrayList<>();
    private final GroupOfCards deck;
    private int pot;

    public TeenPattiGame(String name) {
        super(name);
        deck = new GroupOfCards();
        deck.shuffle();
        pot = 0;
    }

    public void addPlayer(String name, int money) {
        players.add(new TeenPattiPlayer(name, money));
    }

    @Override
    public void play() {
        for (TeenPattiPlayer player : players) {
            for (int i = 0; i < 3; i++) {
                player.addCard((TeenPattiCard) deck.dealCard());
            }
        }

        simulateBetting();

        displayAllPlayersCards();

        declareWinner();
    }

    private void simulateBetting() {
        Scanner scanner = new Scanner(System.in);
        for (TeenPattiPlayer player : players) {
            System.out.println(player.getName() + ", enter your bet amount: ");
            int bet = scanner.nextInt();
            pot += bet;
            player.updateMoney(-bet);
        }
    }

    private void displayAllPlayersCards() {
        System.out.println("\n--- Players' Cards ---");
        for (TeenPattiPlayer player : players) {
            System.out.println(player.getName() + "'s Hand: " + player.getHand());
        }
        System.out.println("----------------------\n");
    }

    @Override
    public void declareWinner() {
        TeenPattiPlayer winner = players.get(0);

        for (TeenPattiPlayer player : players) {
            if (TeenPattiHandEvaluator.evaluateHand(player.getHand()) > 
                TeenPattiHandEvaluator.evaluateHand(winner.getHand())) {
                winner = player;
            }
        }

        System.out.println("The winner is " + winner.getName() + " with hand: " + winner.getHand());
        System.out.println("Total pot: $" + pot);
    }
}