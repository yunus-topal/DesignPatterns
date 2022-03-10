package SingletonPackage;

import AbstractFactory.CarProducer;

public class Main {
    public static void main(String[] args){
        CarProducer cp = SingleInstance.getCp();
        cp.produceCar("Mercedes", "SUV", "A100", "yellow");
    }
}
