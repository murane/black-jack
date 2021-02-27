public class DealerDrawPolicy implements DrawPolicy {

    @Override
    public boolean canDraw(User user) {
        if (user.cards.size() < 2) {
            return true;
        }
        if (user.cards.size() == 2 && Calculator.sumCardPoint(user.cards) < 17) {
            return true;
        }
        return false;
    }
}
