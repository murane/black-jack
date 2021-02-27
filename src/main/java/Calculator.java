import java.util.List;

public class Calculator {

    public static int sumCardPoint(List<Card> cards) {
        int sum = 0;
        for (Card card : cards) {
            sum += convert(card.getCardNumber());
        }
        return sum;
    }

    private static int convert(String cardNumber) {
        if (cardNumber.equals("A")) {
            return 1;
        }
        if (cardNumber.equals("J") || cardNumber.equals("Q") || cardNumber.equals("K")) {
            return 10;
        }
        return Integer.parseInt(cardNumber);
    }

}
