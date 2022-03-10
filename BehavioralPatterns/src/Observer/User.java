package Observer;

public class User implements Subscriber{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String s) {
        System.out.println("user " + name  + " is notified for new: " + s);
    }
}
