import card.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import policy.WinnerPolicy;
import policy.WinnerPolicyImpl;
import user.User;
import user.UserFactory;

public class WinnerPolicyTest {

    @Test
    void testWinner() {
        WinnerPolicy winnerPolicy = new WinnerPolicyImpl();

        User dealer = UserFactory.getDealer();
        dealer.addCard(new Card("d", "10"));
        dealer.addCard(new Card("d", "Q"));

        User gamer = UserFactory.getGamer();
        gamer.addCard(new Card("d", "9"));
        gamer.addCard(new Card("d", "K"));

        User winner = winnerPolicy.determine(dealer, gamer);

        Assertions.assertEquals(winner, dealer);
    }


}
