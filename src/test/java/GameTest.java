import controller.Game;
import org.junit.jupiter.api.Test;

public class GameTest {
    //Game은 Deck을 생성
    //Dealer와 Player를 생성하며 Deck을 주입
    //Dealer의 패가 16이하면 17이상일 될때까지 hit(한장은 오픈)

    //Gamer는 stand or hit가 가능
    //hit시 hand가 21을 초과하면 bust -> 패배
    //stand시 Dealer와 Gamer의 핸드를 오픈하고 승패가 결정됨

    //end()메소드는

    @Test
    void isGamerWantToHit_정상입력_true(){
        Game game = new Game();
        game.play();
    }

}
