package Observer;

import java.util.ArrayList;

public class SubscriptionManager {
    private ArrayList<Subscriber> subscribers;

    public SubscriptionManager(ArrayList<Subscriber> subs){
        this.subscribers = subs;
    }

    public void sendNotification(String news){
        for(Subscriber s: subscribers){
            s.update(news);
        }
    }

    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }


}
