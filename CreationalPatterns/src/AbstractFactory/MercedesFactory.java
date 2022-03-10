package AbstractFactory;

import AbstractFactory.CarTypes.SUV;
import AbstractFactory.CarTypes.Sedan;

public class MercedesFactory implements CarFactory{
    @Override
    public MercedesSUV produceSUV(String model, String color) {
        return new MercedesSUV(model, color);
    }

    @Override
    public MercedesSedan produceSedan(String model, String color) {
        return new MercedesSedan(model, color);
    }
}
