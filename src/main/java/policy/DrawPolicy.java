package policy;

import user.User;

public interface DrawPolicy {

    boolean canDraw(User user);
}
