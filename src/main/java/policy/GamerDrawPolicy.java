package policy;

import user.User;

public class GamerDrawPolicy implements DrawPolicy {

    @Override
    public boolean canDraw(User user) {
        return true;
    }
}
