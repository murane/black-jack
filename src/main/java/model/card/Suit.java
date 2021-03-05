package model.card;

public enum Suit {
    HEART("heart","♥")
    ,SPADE("spade","♠")
    ,DIAMOND("diamond","♦")
    ,CLOVA("clova","♣");

    private String suitString;
    private String suitSymbol;

    Suit(String suitString, String suitSymbol) {
        this.suitString=suitString;
        this.suitSymbol=suitSymbol;
    }

    public String getSuitSymbol() {
        return suitSymbol;
    }
}
