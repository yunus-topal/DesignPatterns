package State;

public class Main {
    public static void main(String[] args) {
        UserInformation information = new UserInformation();
        information.fetchMessages();
        information.fetchLastSeen();

        information.switchMode();
        information.fetchMessages();
        information.fetchLastSeen();
    }
}
