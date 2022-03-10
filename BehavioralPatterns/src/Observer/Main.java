package Observer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("ahmet");
        User u2 = new User("mehmet");
        ArrayList<Subscriber> subs = new ArrayList<>();
        subs.add(u1);

        SubscriptionManager manager = new SubscriptionManager(subs);
        News news = new News(new ArrayList<String>(), manager);

        news.writeNew("our first new.");
        System.out.println();

        manager.subscribe(u2);
        news.writeNew("our second new.");
        System.out.println();

        manager.unsubscribe(u1);
        news.writeNew("latest new.");




    }
}
