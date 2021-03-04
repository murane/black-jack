package player;

import game.Card;
import game.Deck;

import java.util.List;


public interface Player {
    Card action(Deck deck);

    int getScore();

    int getCardNum();

    List<Card> getCards();

    boolean isEnd();

    void status();

    void draw(Deck deck, Card card);
}
