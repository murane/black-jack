package game;

public class Card {
    private Mark mark;
    private Integer num;

    public Card(Mark mark, String N)  {
        this.mark = mark;

        if(N.equals("K") ||  N.equals("Q") || N.equals("J"))
            this.num = 10;
        else if(N.equals("A"))
            this.num=1;
        else
            this.num = Integer.parseInt(N);
    }

    public int getScore() {
        return num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mark='" + mark + '\'' +
                ", num=" + num +
                '}';
    }
}
