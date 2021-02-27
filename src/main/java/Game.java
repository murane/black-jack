import java.util.ArrayList;
import java.util.List;

public class Game {
    private ArrayList<Card> deck;
    private Player gamer;
    private Player dealer;

    public Game() {
        deck = new ArrayList<>();

        makeDeck("D");
        makeDeck("S");
        makeDeck("C");
        makeDeck("H");

        gamer = new Player();
        dealer = new Player();

        //+2장 뽑기
    }

    private void makeDeck(String mark) {
        deck.add(new Card(mark, "1"));
        deck.add(new Card(mark,"2"));
        deck.add(new Card(mark,"3"));
        deck.add(new Card(mark,"4"));
        deck.add(new Card(mark,"5"));
        deck.add(new Card(mark,"6"));
        deck.add(new Card(mark,"7"));
        deck.add(new Card(mark,"8"));
        deck.add(new Card(mark,"9"));
        deck.add(new Card(mark,"10"));
        deck.add(new Card(mark,"J"));
        deck.add(new Card(mark,"Q"));
        deck.add(new Card(mark,"K"));
    }

    public void calculate() {
        if(!(gamer.isEnd() && dealer.isEnd())) {
            return;
        }

        if(gamer.getScore() > 21) {
            System.out.println("dealer wins");
            return;
        }

        if(dealer.getScore() > gamer.getScore())
            System.out.println("dealer wins");
        else
            System.out.println("gamer wins");
    }

    public Player getGamer() {
        return gamer;
    }

    public Player getDealer() {
        return dealer;
    }

    public Card draw(Player P, int idx) {
        Card card = deck.get(idx);
        P.draw(deck.get(idx));
        deck.remove(idx);
        return card;
    }

    public List<Card> getDeck() {
        return deck;
    }
}
