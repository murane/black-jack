package controller;

import model.Dealer;
import model.Deck;
import model.Gamer;

public class Game {
    private final Deck deck;
    private final Dealer dealer;
    private final Gamer gamer;
    private final View view;

    public Game(){
        deck = new Deck();
        dealer = new Dealer(deck);
        gamer = new Gamer(deck);
    }

    public void play(){

    }
}
