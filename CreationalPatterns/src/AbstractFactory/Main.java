package AbstractFactory;

import AbstractFactory.CarTypes.Car;

import java.util.ArrayList;

public class Main {
    public static  void main(String [] args){
/*        CarFactory cf = CarProducer.produceFactory("BMW");
        Car c1 = cf.produceSUV("newSuv", "blue");*/

        CarProducer cp = new CarProducer();
        Car c2 = cp.produceCar("Mercedes", "Sedan", "c200", "black");
        Car c3 = cp.produceCar("BMW", "Sedan", "E2", "white");
        Car c4 = cp.produceCar("Mercedes", "SUV", "A200", "pink");
        Car c5 = cp.produceCar("Mercedes", "Sedan", "E500", "green");
        Car c6 = cp.produceCar("BMW", "SUV", "X5", "white");
        Car c7 = cp.produceCar("Mercedes", "Sedan", "D300", "blue");

        ArrayList<Car> cars = cp.getCars();
        for(Car item: cars){
            System.out.println(item.getModel());
        }



    }

}
