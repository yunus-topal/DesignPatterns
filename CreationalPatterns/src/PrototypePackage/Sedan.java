package PrototypePackage;

public class Sedan extends Car{
    public String screenType;

    public Sedan(){
        super();
    }

    public Sedan(Sedan s) {
        super(s);
        this.screenType = s.screenType;
    }


    @Override
    public Car cloneCar() {
        return new Sedan(this);
    }
}
