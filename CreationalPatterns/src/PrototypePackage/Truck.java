package PrototypePackage;

public class Truck extends Car {
    public int capacity;

    public Truck(){
        super();
    }
    public Truck(Truck t) {
        super(t);
        this.capacity = t.capacity;
    }

    @Override
    public Car cloneCar() {
        return new Truck(this);
    }
}
