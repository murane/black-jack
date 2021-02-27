public class Card {

    private String pattern;
    private String cardNumber;

    public Card(String pattern, String cardNumber) {
        if (!isValid(pattern, cardNumber)) {
            throw new IllegalArgumentException();
        }
        this.pattern = pattern;
        this.cardNumber = cardNumber;
    }

    public String getPattern() {
        return pattern;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private boolean isValid(String pattern, String cardNumber) {
        return isPatternValid(pattern) && isCardNumberValid(cardNumber);
    }

    private boolean isPatternValid(String pattern) {
        return pattern.equals("d") || pattern.equals("c") || pattern.equals("h") || pattern.equals("s");
    }

    private boolean isCardNumberValid(String cardNumber) {
        if (cardNumber.equals("A") || cardNumber.equals("J") || cardNumber.equals("Q") || cardNumber.equals("K")) {
            return true;
        }
        if (Integer.parseInt(cardNumber) <= 10 && Integer.parseInt(cardNumber) >= 2) {
            return true;
        }
        return false;
    }

}
