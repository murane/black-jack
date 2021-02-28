package user;

import card.Card;
import policy.DrawPolicy;

import java.util.*;

public class User {

    private List<Card> cards;
    private DrawPolicy drawPolicy;

    public User(DrawPolicy drawPolicy) {
        this.cards = new ArrayList<>();
        this.drawPolicy = drawPolicy;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public boolean canDraw() {
        return drawPolicy.canDraw(this);
    }

    public List<Card> getCards() {
        return cards;
    }
}