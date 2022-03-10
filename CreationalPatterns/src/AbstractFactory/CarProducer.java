package AbstractFactory;

import AbstractFactory.CarTypes.Car;

import java.util.ArrayList;

public class CarProducer {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public int getCarCount() {
        return cars.size();
    }

    public ArrayList<Car> getCars(){
        return cars;
    }

    public Car produceCar(String factory, String cartype, String model, String color){
        if(factory.equals("BMW")){
            CarFactory cf = new BMWFactory();
            if(cartype.equals("SUV")){
                Car c = cf.produceSUV(model, color);
                cars.add(c);
                return c;
            }
            else if(cartype.equals("Sedan")){
                Car c = cf.produceSedan(model, color);
                cars.add(c);
                return c;
            }
        }
        else if(factory.equals("Mercedes")){
            CarFactory cf = new MercedesFactory();
            if(cartype.equals("SUV")){
                Car c = cf.produceSUV(model, color);
                cars.add(c);
                return c;
            }
            else if(cartype.equals("Sedan")){
                Car c = cf.produceSedan(model, color);
                cars.add(c);
                return c;
            }
        }
        return null;
    }

    public static CarFactory produceFactory(String factory){
        if(factory.equals("BMW")){
            return new BMWFactory();
        }
        else if (factory.equals("Mercedes")){
            return new MercedesFactory();
        }
        else {
            return null;
        }
    }
}
