package policy;

import user.User;
import util.Calculator;

public class DealerDrawPolicy implements DrawPolicy {

    @Override
    public boolean canDraw(User user) {
        if (user.getCards().size() < 2) {
            return true;
        }
        if (user.getCards().size() == 2 && Calculator.sumCardPoint(user.getCards()) < 17) {
            return true;
        }
        return false;
    }
}
