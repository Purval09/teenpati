/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package deliverable;


public abstract class Game {
     
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public abstract void play();

    public abstract void declareWinner();
}
