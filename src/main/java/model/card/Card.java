package model.card;

public class Card {
    private Suit suit;
    private Number number;

    //TODO::suit, number 포장
    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }

    public String getSuit() {
        return suit.getSuitSymbol();
    }

    public int getNumber() {
        return number.getNumberValue();
    }

    public String getNumberOfString(){
        return number.getNumberString();
    }
    @Override
    public String toString(){
        return getSuit() + getNumber();
    }
}
