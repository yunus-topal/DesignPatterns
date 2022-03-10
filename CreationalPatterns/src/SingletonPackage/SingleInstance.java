package SingletonPackage;

import AbstractFactory.CarProducer;

public class SingleInstance {
    private static CarProducer cp;

    public static CarProducer getCp(){
        CarProducer result = cp;
        if(cp != null){
            return result;
        }
        synchronized (SingleInstance.class){
            if (cp == null) {
                cp = new CarProducer();
            }
            return cp;
        }
    }
}
