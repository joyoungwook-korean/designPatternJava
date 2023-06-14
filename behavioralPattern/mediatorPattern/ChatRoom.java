package behavioralPattern.mediatorPattern;

public class ChatRoom {

    public static String getMessage(User user, String message) {
        return user.getName() + message;
    }

}
