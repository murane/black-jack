package policy;

import user.User;

public interface WinnerPolicy {

    User determine(User gamer, User dealer);
}
