package Observer;

import java.util.ArrayList;

public class News {
    private ArrayList<String> news;
    SubscriptionManager manager;

    public News(ArrayList<String> news, SubscriptionManager manager) {
        this.news = news;
        this.manager = manager;
    }

    public void writeNew(String s){
        news.add(s);
        manager.sendNotification(s);
    }
}
