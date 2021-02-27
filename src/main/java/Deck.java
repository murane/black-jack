import java.util.*;

public class Deck {

    private Queue<Card> cards;

    public Deck(List<Card> cards) {
        Collections.shuffle(cards);
        this.cards = new LinkedList<>(cards);
    }

    public Card draw() {
        return cards.poll();
    }
}
