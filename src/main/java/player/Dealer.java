package player;

import java.util.LinkedList;
import java.util.List;

import game.Deck;
import game.Card;

public class Dealer implements Player {
    private int score;
    private boolean end;
    private int cardNum;
    private List<Card> cards;

    public Dealer() {
        cards = new LinkedList<>();
        this.score = 0;
        this.end = false;
        this.cardNum = 0;
    }

    @Override
    public Card action(Deck deck) {
        Card card = deck.top();
        if(score <= 16) {
            draw(deck, card);
        }
        else
            end = true;

        if(score>21) {
            end = true;
            return card;
        }

        return card;
    }

    @Override
    public boolean isEnd() {
        return end;
    }

    @Override
    public void status() {
        System.out.println("Dealer info");
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println("# of Cards: " + cardNum);
        System.out.println("score: " + score);
        System.out.println();
    }

    @Override
    public void draw(Deck deck, Card card) {
        this.cards.add(card);
        this.cardNum++;
        this.score += card.getScore();
        deck.getCards().remove(card);
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getCardNum() {
        return cardNum;
    }

    @Override
    public List<Card> getCards() {
        return cards;
    }
}

