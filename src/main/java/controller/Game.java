package controller;

import model.Rule;
import model.player.Dealer;
import model.card.Deck;
import model.player.Gamer;
import model.player.Player;
import view.View;

public class Game {

    private final Deck deck;
    private final Dealer dealer;
    private final Gamer gamer;
    private final View view;

    public Game(){
        deck = new Deck();
        dealer = new Dealer();
        gamer = new Gamer();
        view = new View();
    }

    public void play(){
        Init();
        while (!isBust(gamer) && isGamerWantToHit()){
            playHit(gamer,true,false);
        }
        if(isBust(gamer)){
            view.printDescription(Rule.LOSE,false);
            return;
        }
        while(dealer.getStat()<= Rule.DEALER_RULE){
            playHit(dealer,true,false);
        }
        if(isBust(dealer)){
            view.printDescription(Rule.WIN,false);
            return;
        }
        judge();
    }

    private void Init(){
        playHit(dealer,false,true);
        playHit(gamer,true,true);
    }

    private void judge(){
        view.printDescription(Rule.DEALER_CARDS,false);
        view.printHandOfPlayer(dealer,true);
        if(gamer.getStat()>dealer.getStat()){
            view.printDescription(Rule.WIN,false);
        }
        if(dealer.getStat()>gamer.getStat()){
            view.printDescription(Rule.LOSE,false);
        }
        if(gamer.getStat()==dealer.getStat()){
            view.printDescription(Rule.DRAW,false);
        }
    }

    private void playHit(Player player, boolean openAll,boolean isInit){
        player.hit(deck);
        if(isInit){
            player.hit(deck);
        }
        if(player==gamer){
            view.printDescription(Rule.GAMER_CARDS,false);
            view.printHandOfPlayer(player,openAll);
        }
        if(player==dealer){
            view.printDescription(Rule.DEALER_CARDS,false);
            view.printHandOfPlayer(player,openAll);
        }
    }

    private boolean isBust(Player player){
        if(player.getStat()> Rule.BLACKJACK){
            view.printDescription(Rule.BUST_CASE,true);
            view.printHandOfPlayer(player,true);
            return true;
        }
        return false;
    }

    private boolean isGamerWantToHit(){
        String answer = view.AskGamerToHitOrStand(null);
        if(answer.equals(Rule.HIT)){
            return true;
        }
        return false;
    }

}
