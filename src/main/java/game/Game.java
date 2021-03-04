package game;

import player.Dealer;
import player.Gamer;
import player.Player;

public class Game {
    private Deck deck;
    private Player gamer;
    private Player dealer;

    public Game() {
        deck = new Deck();
        gamer = new Gamer();
        dealer = new Dealer();

        dealer.draw(deck, deck.top());
        gamer.draw(deck, deck.top());
        dealer.draw(deck, deck.top());
        gamer.draw(deck, deck.top());

        dealer.status();
        gamer.status();
    }

    public void play() {
        while(!(dealer.isEnd() && gamer.isEnd())) {
            if (!dealer.isEnd()) {
                dealer.action(deck);
                dealer.status();
            }

            if(dealer.getScore()>21)
                break;

            if (!gamer.isEnd()) {
                gamer.action(deck);
                gamer.status();
            }

            if(gamer.getScore()>21)
                break;
        }
        calculate();
    }

    public void calculate() {
        if(!(gamer.isEnd() && dealer.isEnd())) {
            return;
        }

        if(dealer.getScore() > 21) {
            System.out.println("gamer wins");
            return;
        }

        if(gamer.getScore() > 21) {
            System.out.println("dealer wins");
            return;
        }

        if(dealer.getScore() > gamer.getScore())
            System.out.println("dealer wins");
        else if(dealer.getScore() < gamer.getScore())
            System.out.println("gamer wins");
        else
            System.out.println("DRAW");
    }

    public Player getGamer() {
        return gamer;
    }
    public Player getDealer() {
        return dealer;
    }
    public Deck getDeck() {
        return deck;
    }


}
