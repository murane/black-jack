package card;

import java.util.ArrayList;
import java.util.List;

public class DeckFactory {

    public static Deck getDefaultDeck() {
        List<Card> cards = new ArrayList<>();
        String[] alphabets = {"h", "c", "s", "d"};
        String[] cardNumbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new Card(alphabets[i], cardNumbers[j]));
            }
        }

        return new Deck(cards);
    }
}
