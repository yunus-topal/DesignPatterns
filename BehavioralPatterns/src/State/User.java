package State;

public abstract class User {
    protected UserInformation information;

    abstract void showMessages();
    abstract void showLastSeen();
    abstract void setContext();

    public User(UserInformation information){
        this.information = information;
    }



}
