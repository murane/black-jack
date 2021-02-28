package policy;

import user.User;
import util.Calculator;

public class WinnerPolicyImpl implements WinnerPolicy {

    @Override
    public User determine(User gamer, User dealer) {
        int gamerResult = Calculator.sumCardPoint(gamer.getCards());
        int dealerResult = Calculator.sumCardPoint(dealer.getCards());

        if(gamerResult > 21) {
            return dealer;
        }
        if(dealerResult > 21) {
            return gamer;
        }
        if(gamerResult > dealerResult) {
            return gamer;
        }
        return dealer;
    }
}
