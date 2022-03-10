package AbstractFactory;
import AbstractFactory.CarTypes.Sedan;

public class BMWFactory implements CarFactory {
    @Override
    public BMWSUV produceSUV(String model, String color) {
        return new BMWSUV(model, color);
    }

    @Override
    public BMWSedan produceSedan(String model, String color) {
        return new BMWSedan(model, color);
    }
}
