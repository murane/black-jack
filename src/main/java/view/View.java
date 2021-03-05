package view;

import model.Rule;
import model.card.Cards;
import model.player.Player;

import java.util.Objects;
import java.util.Scanner;

public class View {
    private static final String HIT_OR_STAND_TEXT = "Hit or Stand?(h/s) : ";
    private static final String WRONG_INPUT_TEXT = "Wrong input Please enter h or s";
    private static final String DIVIDER = "-----------------------------";

    private final Scanner sc;

    public View(){
        sc = new Scanner(System.in);
    }

    public String AskGamerToHitOrStand(Scanner sc){
        if(sc==null){
            sc=this.sc;
        }
        String playerAnswer="";
        while(true){
            try {
                printDescription(HIT_OR_STAND_TEXT,false);
                playerAnswer = sc.next();
                validateAnswer(playerAnswer);
            }catch (Exception e){
                printDescription(WRONG_INPUT_TEXT,true);
                continue;
            }
            break;
        }
        return playerAnswer;
    }
    private void validateAnswer(String answer) throws RuntimeException{
        String a= answer.toLowerCase();
        String b = answer.toLowerCase();
        if(!answer.equals(Rule.STAND) && !answer.equals(Rule.HIT)){
            throw new RuntimeException();
        }
    }

    public void printDescription(String description, boolean needLineFeed){
        if(needLineFeed){
            printDescription(description+"\n",false);
            return;
        }
        System.out.print(description);
    }
    public void printHandOfPlayer(Player player, boolean openAll){
        Cards cards = player.getCards();
        if(openAll){
            cards.getStream()
                    .map(Object::toString)
                    .forEach(s -> System.out.print(s+" "));
            System.out.println();
            return;
        }
        cards.getStream()
                .map(Objects::toString)
                .limit(1)
                .forEach(System.out::print);
        System.out.println();
    }
}
