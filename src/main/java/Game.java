import card.Deck;
import policy.WinnerPolicy;;
import user.User;
import user.UserFactory;

import java.util.Scanner;

public class Game {

    private WinnerPolicy winnerPolicy;
    private User dealer;
    private User gamer;
    private Deck deck;

    public Game(WinnerPolicy winnerPolicy, Deck deck, User dealer, User gamer) {
        this.winnerPolicy = winnerPolicy;
        this.deck = deck;
        this.dealer = dealer;
        this.gamer = gamer;
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            dealer.addCard(deck.draw());
            gamer.addCard(deck.draw());
        }
        if (dealer.canDraw()) {
            dealer.addCard(deck.draw());
        }
        while (askGamerToDrawMore()) {
            gamer.addCard(deck.draw());
        }
    }

    public boolean askGamerToDrawMore() {
        System.out.println("Would you draw more card? [Y/N]");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        return input.equals("Y");
    }

    public void getWinner() {
        System.out.println("Winner : "+winnerPolicy.determine(dealer, gamer).toString());
    }
}

