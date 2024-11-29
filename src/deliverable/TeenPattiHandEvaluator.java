/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Purval
 */
public class TeenPattiHandEvaluator {
    public static int evaluateHand(ArrayList<TeenPattiCard> hand) {
        Collections.sort(hand, (card1, card2) -> 
            getCardValue(card2) - getCardValue(card1));

        boolean isSameSuit = hand.get(0).getSuit().equals(hand.get(1).getSuit()) &&
                             hand.get(1).getSuit().equals(hand.get(2).getSuit());
        boolean isConsecutive = getCardValue(hand.get(0)) - getCardValue(hand.get(1)) == 1 &&
                                getCardValue(hand.get(1)) - getCardValue(hand.get(2)) == 1;

        if (hand.get(0).getRank().equals(hand.get(1).getRank()) &&
            hand.get(1).getRank().equals(hand.get(2).getRank())) {
            return 6;
        } else if (isSameSuit && isConsecutive) {
            return 5;
        } else if (isConsecutive) {
            return 4;
        } else if (isSameSuit) {
            return 3;
        } else if (hand.get(0).getRank().equals(hand.get(1).getRank()) ||
                   hand.get(1).getRank().equals(hand.get(2).getRank()) ||
                   hand.get(0).getRank().equals(hand.get(2).getRank())) {
            return 2;
        } else {
            return 1;
        }
    }

    public static int getCardValue(TeenPattiCard card) {
        switch (card.getRank()) {
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return 0;
        }
    }
    
}
