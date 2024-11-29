/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable;

import java.util.ArrayList;

public class TeenPattiPlayer extends Player{
    
    private ArrayList<TeenPattiCard> hand = new ArrayList<>();
    private int money;

    public TeenPattiPlayer(String name, int startingMoney) {
        super(name);
        this.money = startingMoney;
    }

    public ArrayList<TeenPattiCard> getHand() {
        return hand;
    }

    public void addCard(TeenPattiCard card) {
        hand.add(card);
    }

    public int getMoney() {
        return money;
    }

    public void updateMoney(int amount) {
        this.money += amount;
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing...");
    }
       
}
