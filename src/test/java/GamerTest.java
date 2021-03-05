import model.card.Cards;
import model.card.Deck;
import model.player.Gamer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GamerTest {
    //게이머 생성
    //draw를 했을때, 카드가 추가된다(카드길이 테스트)
    //TODO 3. Hit은 누가 주관?

    Gamer gamer;
    Deck deck;
    @BeforeEach
    void 게이머생성(){
        deck = new Deck();
        gamer = new Gamer();
    }

    @Test
    void hit테스트(){
        gamer.hit(deck);
        Cards cards = gamer.getCards();
        assertThat(cards.getSize()).isEqualTo(3);
    }
}
