package game;

import java.util.LinkedList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new LinkedList<>();

        makeDeck(Mark.HEART);
        makeDeck(Mark.DIAMOND);
        makeDeck(Mark.SPADE);
        makeDeck(Mark.CLOVER);
    }

    public List<Card> getCards() {
        return cards;
    }

    private void makeDeck(Mark mark) {
        cards.add(new Card(mark, "1"));
        cards.add(new Card(mark,"2"));
        cards.add(new Card(mark,"3"));
        cards.add(new Card(mark,"4"));
        cards.add(new Card(mark,"5"));
        cards.add(new Card(mark,"6"));
        cards.add(new Card(mark,"7"));
        cards.add(new Card(mark,"8"));
        cards.add(new Card(mark,"9"));
        cards.add(new Card(mark,"10"));
        cards.add(new Card(mark,"J"));
        cards.add(new Card(mark,"Q"));
        cards.add(new Card(mark,"K"));
    }

    public Card scatter() {
        int size = cards.size();
        int randIdx = (int)(Math.random() * size);
        Card card = cards.get(randIdx);
        cards.remove(randIdx);
        return card;
    }

    public Card top() {
        int size = cards.size();
        int randIdx = (int)(Math.random() * size);
        return cards.get(randIdx);
    }
}
