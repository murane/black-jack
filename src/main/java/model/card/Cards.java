package model.card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Cards {
    private LinkedList<Card> cards=new LinkedList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public Card peek() {
        return cards.peek();
    }

    public int getStat() {
        return cards.stream().mapToInt(Card::getNumber).sum();
    }

    public Stream<?> getStream(){
        return cards.stream();
    }

    public Card pop() {
        return cards.pop();
    }

    public int getSize() {
        return cards.size();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
