import model.card.Deck;
import model.player.Dealer;
import org.junit.jupiter.api.Test;
import view.View;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class ViewTest {
    @Test
    void 핸드프린트테스트(){
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        dealer.hit(deck);
        dealer.hit(deck);
        dealer.hit(deck);

        View view = new View();
        view.printHandOfPlayer(dealer,true);
    }
    @Test
    void  validation테스트(){
        View view = new View();
        String input = "h";
        String output = view.AskGamerToHitOrStand(new Scanner(input));
        assertThat(output).isEqualTo(input);
    }
    @Test
    void 테스트(){
        String test="h";
        assertThat(test.toLowerCase()).isEqualTo(test);
    }

}
