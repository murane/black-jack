package model.card;

public class Deck {
    private Cards cards = new Cards();

    public Deck() {
        for(Suit suit : Suit.values()){
            generateNumberOf(suit);
        }
        cards.shuffle();
    }

    private void generateNumberOf(Suit suit){
        for(Number number : Number.values()){
            Card card = new Card(suit, number);
            cards.add(card);
        }
    }

    public Cards getCards() {
        return cards;
    }

    public Card pop() {
        return cards.pop();
    }
}
