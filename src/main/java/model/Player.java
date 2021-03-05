package model;

public interface Player {
    public Cards getCards();
    public void draw(Deck deck);
    public int getStat();
}
