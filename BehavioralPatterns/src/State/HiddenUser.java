package State;

public class HiddenUser extends User{

    public HiddenUser(UserInformation information){
        super(information);
    }


    @Override
    void showMessages() {
        System.out.println("Hidden user views messages");
    }

    @Override
    void showLastSeen() {
        System.out.println("You can't see other peoples last seen if you hide yourself.");
    }

    @Override
    public void setContext() {
        information.changeState(new NormalUser(information));
    }
}
