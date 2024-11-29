
package deliverable;
import java.util.ArrayList;
import java.util.Collections;


public class GroupOfCards {
    
   private ArrayList<Card> cards = new ArrayList<>();

    public GroupOfCards() {
        
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new TeenPattiCard(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.remove(0);
    }

    public int size() {
        return cards.size();
    }
}
