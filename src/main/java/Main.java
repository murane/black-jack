import card.DeckFactory;
import policy.WinnerPolicyImpl;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(
                new WinnerPolicyImpl(),
                DeckFactory.getDefaultDeck()
        );
        game.run();
    }
}
