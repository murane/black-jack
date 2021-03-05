package model.player;

import model.card.Card;
import model.card.Cards;
import model.card.Deck;

public class Dealer implements Player{
    private Cards cards= new Cards();

    @Override
    public Cards getCards() {
        return cards;
    }

    @Override
    public void hit(Deck deck) {
        Card card = deck.pop();
        cards.add(card);
    }

    @Override
    public int getStat() {
        return cards.getStat();
    }

    public boolean isStand(){
        if(getStat()>=17){
            return true;
        }
        return false;
    }

}
