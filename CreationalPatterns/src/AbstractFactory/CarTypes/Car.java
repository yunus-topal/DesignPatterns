package AbstractFactory.CarTypes;

public abstract class Car {
    public String getModel() {
        return model;
    }

    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void printInfo(){
        System.out.println("FactoryPackage.CarTypes.Car info: " + this.model + " " + this.color);
    }
}
