import model.card.Cards;
import model.card.Deck;
import model.player.Gamer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DealerTest {
    Gamer gamer;
    Deck deck;

    //1. 생성자에게 Deck을 알려준다
    //2. 생성자에게 카드 두개(Cards로 포장한)를 넣어준다.

    @BeforeEach
    void 딜러생성(){
        deck = new Deck();
        gamer = new Gamer();
    }

    @Test
    void hit테스트_16점(){
        gamer.hit(deck);
        Cards cards = gamer.getCards();
        assertThat(cards.getSize()).isEqualTo(3);
    }
}
