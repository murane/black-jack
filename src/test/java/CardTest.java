import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

    @DisplayName("적절하지 않은 인자를 체크하는가.")
    @Test
    void testCardArguments() {
        Card card = new Card("d", "3");
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Card("q", "3"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Card("h", "F"));
    }

}
