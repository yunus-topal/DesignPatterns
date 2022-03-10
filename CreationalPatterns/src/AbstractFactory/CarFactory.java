package AbstractFactory;

import AbstractFactory.CarTypes.SUV;
import AbstractFactory.CarTypes.Sedan;

public interface CarFactory {
    SUV produceSUV(String model, String color);

    Sedan produceSedan(String model, String color);

}
