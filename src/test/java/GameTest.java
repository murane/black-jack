import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GameTest {

    private Player gamer;
    private Player dealer;
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
        gamer = game.getGamer();
        dealer = game.getDealer();
    }

    @Test
    public void chooseCard() {
        Card card1 = new Card("H", "1"); // Heart 1
        Card card2 = new Card("D", "1"); // Diamond 1

        Player player = new Player();
        player.draw(card1);
        player.draw(card2);

        assertEquals(2, player.getScore());
    }

    @Test
    public void chooseCard_2() {
        Card card1 = new Card("H", "10"); // Heart 10
        Card card2 = new Card("D", "J"); // Diamond Jack
        Card card3 = new Card("S", "2"); // Spade 2
        Card card4 = new Card("C", "1"); // Clover 1

        gamer.draw(card1);
        dealer.draw(card2);
        gamer.draw(card3);
        dealer.draw(card4);

        assertEquals(12, gamer.getScore());
        assertEquals(11, dealer.getScore());
    }

    @Test
    public void winner() {
        Card card1 = new Card("H", "10"); // Heart 1
        Card card2 = new Card("D", "J"); // Diamond 1
        Card card3 = new Card("S", "2"); // Heart 1
        Card card4 = new Card("C", "1"); // Diamond 1

        gamer.draw(card1);
        dealer.draw(card2);
        gamer.draw(card3);
        dealer.draw(card4);

        assertEquals(12, gamer.getScore());
        assertEquals(11, dealer.getScore());

        game.calculate();
    }

    @Test
    public void chooseCardAndRemoveFromDeck() {
        Card drawCard = game.draw(gamer, 0);// Diamond 1
        assertEquals(1, gamer.getScore());
        List<Card> deck = game.getDeck();
        assertFalse(deck.contains(drawCard));
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    @Test
    public void playerActionTest() {
        Card card1 = new Card("H", "10"); // Heart 1
        Card card2 = new Card("D", "J"); // Diamond 1
        Card card3 = new Card("S", "2"); // Heart 1
        Card card4 = new Card("C", "1"); // Diamond 1
        Card card5 = new Card("H", "5"); // Heart 5
        Card card6 = new Card("D", "Q"); // Diamond Queen

        gamer.draw(card1);
        dealer.draw(card2);
        gamer.draw(card3);
        dealer.draw(card4);

        assertEquals(12, gamer.getScore());
        assertEquals(11, dealer.getScore());

        positiveUserInput();
        gamer.action_G(card5);
        dealer.action_D(card6);

        game.calculate();
    }

    private void positiveUserInput() {
        String data = "1";
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
        } finally {
            System.setIn(stdin);
        }
    }

    /*
    TODO 계속 뽑을건지 사용자 input 받기
         누가 이겼는지 판단하기
         21을 초과한 경우 테스트 작성
         README 작성
     */
}
