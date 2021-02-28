import card.Card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import policy.DealerDrawPolicy;
import policy.GamerDrawPolicy;
import user.User;

public class UserTest {

    @Test
    @DisplayName("게이머 카드 뽑기")
    void testGamerGetDraw() {
        User user = new User(new GamerDrawPolicy());

        user.addCard(new Card("h", "5"));
        Assertions.assertEquals(user.getCards().size(), 1);
    }

    @Test
    @DisplayName("딜러 카드 뽑기")
    void testDealerGetDraw() {
        User user = new User(new DealerDrawPolicy());

        user.addCard(new Card("h", "4"));
        Assertions.assertEquals(user.getCards().size(), 1);
    }

    @Test
    @DisplayName("17미만인 경우 1번 더 뽑기")
    void testDealerGetMoreDraw() {
        User user = new User(new DealerDrawPolicy());

        user.addCard(new Card("h", "5"));
        user.addCard(new Card("h", "4"));
        Assertions.assertTrue(user.canDraw());

        user.addCard(new Card("c", "K"));
        Assertions.assertFalse(user.canDraw());
    }
}
