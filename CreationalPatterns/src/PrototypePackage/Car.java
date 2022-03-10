package PrototypePackage;

public abstract class Car {
    public String model;
    public int price;
    public int year;


    public Car() {
    }

    public Car(Car c){
        this.model = c.model;
        this.price = c.price;
        this.year = c.year;
    }

    public abstract Car cloneCar();
}
