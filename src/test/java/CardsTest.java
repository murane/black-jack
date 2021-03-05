import model.card.Card;
import model.card.Cards;
import model.card.Number;
import model.card.Suit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class CardsTest {

    Cards cards;
    @BeforeEach
    void 카드생성(){
        cards = new Cards();
    }

    //1. 카드 초기화
    //2. 카드 추가 및 확인용
    //3. 카드 더미의 점수 반환?
    //4. 카드 꺼내기 pop()
    @Test
    void 카드추가(){
        Card card=new Card(Suit.HEART, Number.ACE);
        cards.add(card);
        assertThat(cards.peek()).isEqualTo(card);
    }
    @Test
    void 카드점수반환(){
        Card card1=new Card(Suit.HEART,Number.ACE);
        Card card2=new Card(Suit.HEART,Number.FIVE);
        Card card3=new Card(Suit.HEART,Number.KING);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        assertThat(cards.getStat()).isEqualTo(16);
    }

    @Test
    void 카드꺼내오기(){
        Card card1=new Card(Suit.HEART,Number.ACE);
        Card card2=new Card(Suit.HEART,Number.FIVE);
        cards.add(card1);
        cards.add(card2);
        assertThat(cards.pop()).isEqualTo(card1);
    }
}
