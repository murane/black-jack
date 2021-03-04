import game.Card;
import game.Deck;
import game.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import player.Dealer;
import player.Player;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Player gamer;
    private Player dealer;
    private Game game;
    private Deck deck;

    @BeforeEach
    void setUp() {
        game = new Game();
        gamer = game.getGamer();
        dealer = game.getDealer();
        deck = game.getDeck();
    } // 게임, 게이머 , 딜러 생성

    @Test
    public void chooseCard() {
        Card card1 = new Card("H", "1"); // Heart 1
        Card card2 = new Card("D", "1"); // Diamond 1

        Dealer player = new Dealer();
        player.draw(deck,card1);
        player.draw(deck,card2);

        assertEquals(2, player.getScore());
    }

    @Test
    public void chooseCard_2() {
        Card card1 = new Card("H", "10"); // Heart 10
        Card card2 = new Card("D", "J"); // Diamond Jack
        Card card3 = new Card("S", "2"); // Spade 2
        Card card4 = new Card("C", "1"); // Clover 1
        int gamerInitialScore = gamer.getScore();
        int dealerInitialScore = dealer.getScore();

        gamer.draw(deck, card1);
        dealer.draw(deck, card2);
        gamer.draw(deck, card3);
        dealer.draw(deck, card4);

        assertEquals(12, gamer.getScore() - gamerInitialScore);
        assertEquals(11, dealer.getScore() - dealerInitialScore);
    }

    @Test
    public void winner() {
        System.out.println(gamer.getScore()+" "+dealer.getScore());
        if(gamer.getScore()>dealer.getScore())
            System.out.println("게이머 승리");
        else if(gamer.getScore()<dealer.getScore())
            System.out.println("딜러 승리");
        else
            System.out.println("무승부");

    }

    @Test
    public void chooseCardAndRemoveFromDeck() {

        assertEquals(48, deck.getCards().size());
        Card card = deck.scatter();
        assertEquals(47, deck.getCards().size());
        assertFalse(deck.getCards().contains(card));
    }

    @Test
    public void dealerActionTest() {

        int gamerScore = gamer.getScore();
        int dealerScore = dealer.getScore();

        Card card = dealer.action(deck);

        if(dealerScore <= 16) {
            assertEquals(dealerScore + card.getScore(), dealer.getScore());

            if(dealerScore > 21) {
                assertTrue(dealer.isEnd());
            }
        }
        else {
            assertEquals(dealerScore, dealer.getScore());
            assertTrue(dealer.isEnd());
        }
    }


    @Test
    public void Deck() {
        Deck deck = new Deck();
    }

    @Test
    public void gameConstruct() {
        assertEquals(2,gamer.getCardNum());
        assertEquals(2,dealer.getCardNum());
    } // 2장씩 뽑았는지 확인

    @Test
    public void dealer_drawCard()   {

    }

}
