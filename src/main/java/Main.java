import card.DeckFactory;
import policy.WinnerPolicyImpl;
import user.UserFactory;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(
                new WinnerPolicyImpl(),
                DeckFactory.getDefaultDeck(),
                UserFactory.getDealer(),
                UserFactory.getGamer()
        );
        game.run();
    }
}
