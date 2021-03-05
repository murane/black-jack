package model.player;

import model.card.Cards;
import model.card.Deck;

public interface Player {
    public Cards getCards();
    public void hit(Deck deck);
    public int getStat();
}
