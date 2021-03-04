package player;

import game.Card;
import game.Deck;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer implements Player {
    private int score;
    private boolean end;
    private int cardNum;
    private List<Card> cards;

    public Gamer() {
        cards = new LinkedList<>();
        this.score = 0;
        this.end = false;
        this.cardNum = 0;
    }

    @Override
    public Card action(Deck deck) {
        Card card = deck.top();
        if(score<=21 && wantToChoose()) {
            draw(deck, card);
        }
        else
            end=true;

        if (score > 21) {
            end = true;
        }
        return card;
    }

    @Override
    public boolean isEnd() {
        return end;
    }

    @Override
    public void status() {
        System.out.println("Gamer info");
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

    private boolean wantToChoose() {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue(1) / Stop(2)");
        result = sc.nextInt();
        return result == 1;
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
