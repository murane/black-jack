public class UserFactory {

    public static User getDealer() {
        return new User(new DealerDrawPolicy());
    }

    public static User getGamer() {
        return new User(new GamerDrawPolicy());
    }
}