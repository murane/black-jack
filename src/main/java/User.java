import java.util.*;

public class User {

    List<Card> cards;
    DrawPolicy drawPolicy;

    public User(DrawPolicy drawPolicy) {
        this.cards = new ArrayList<>();
        this.drawPolicy = drawPolicy;
    }

    public void draw(Deck deck) {
        cards.add(deck.draw());
    }

    public boolean canDraw() {
        return drawPolicy.canDraw(this);
    }

}
