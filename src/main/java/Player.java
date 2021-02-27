import java.util.Scanner;

public class Player {
    private int score;
    private boolean end;

    public void setScore(int S) {
        this.score = S;
    }

    public void draw(Card card) { //(Integer index)
        this.score += card.getScore();
    }

    public int getScore() {
        return score;
    }

    public void action_D(Card card) {
        if(score <= 16) {
            draw(card);
            if(score>21) {
                //  바로 패배
            }
        }
        else
            end=true;
    }

    public void action_G(Card card){
        if(score<=21 && wantToChoose())//뽑고싶으면 +21점 이하일때 가능
                draw(card);
                if(score>21) {
                    //  바로 패배
                }
        else //카드오픈
            end=true;// 결과 계산
    }

    private boolean wantToChoose() {
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue(1) / Stop(2)");
        result = sc.nextBoolean();
        return result;
    }

    public boolean isEnd() {
        return end;
    }
}
