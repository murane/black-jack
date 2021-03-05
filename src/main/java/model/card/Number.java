package model.card;

public enum Number {
    ACE("A",1),TWO("2",2),THREE("3",3)
    ,FOUR("4",4),FIVE("5",5)
    ,SIX("6",6),SEVEN("7",7)
    ,EIGHT("8",8),NINE("9",9)
    ,TEN("10",10),JACK("J",10)
    ,QUEEN("Q",10),KING("K",10);

    private String numberString;
    private int numberValue;

    Number(String numberString, int numberValue){
        this.numberString=numberString;
        this.numberValue=numberValue;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public String getNumberString(){
        return numberString;
    }
}
