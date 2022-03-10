package State;

public class UserInformation {
    private User state;

    public UserInformation(){
        this.state = new NormalUser(this);
    }

    public void changeState(User user){
        this.state = user;
    }

    public void fetchMessages(){
        state.showMessages();
    }

    public void fetchLastSeen(){
        state.showLastSeen();
    }

    public void switchMode(){
        state.setContext();
    }

}
