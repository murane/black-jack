package model;

public class Dealer implements Player{
    private Cards cards= new Cards();

    public Dealer(Deck deck) {
        draw(deck);
        draw(deck);
    }

    @Override
    public Cards getCards() {
        return cards;
    }

    @Override
    public void draw(Deck deck) {
        Card card = deck.pop();
        cards.add(card);
    }

    @Override
    public int getStat() {
        return cards.getStat();
    }


}
