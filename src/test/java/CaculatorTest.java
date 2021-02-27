import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CaculatorTest {

    @Test
    void sumCardPoint() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("d", "2"));
        cards.add(new Card("h", "A"));
        int result = Calculator.sumCardPoint(cards);

        Assertions.assertEquals(result, 3);
    }
}
