package State;

public class NormalUser extends User{

    public NormalUser(UserInformation information){
        super(information);
    }


    @Override
    void showMessages() {
        System.out.println("Normal user view messages.");

    }

    @Override
    void showLastSeen() {
        System.out.println("Normal user view last seen.");
    }

    @Override
    public void setContext() {
        information.changeState(new HiddenUser(information));
    }

}
