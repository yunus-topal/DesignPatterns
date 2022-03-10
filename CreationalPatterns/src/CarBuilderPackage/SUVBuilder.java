package CarBuilderPackage;

public class SUVBuilder implements Builder{
    private SUV suv;

    public SUVBuilder(){
        this.suv = new SUV();
    }
    @Override
    public void setYear(int year) {
        suv.year = year;
    }

    @Override
    public void setSeatNum(int seatNum) {
        suv.seatNum = seatNum;
    }

    @Override
    public void setEngine(String engine) {
        suv.engine = engine;
    }

    @Override
    public void setFuel(String fuel) {
        suv.fuel = fuel;
    }

    @Override
    public void setFuelTankSize(int fuelTankSize) {
        suv.fuelTankSize = fuelTankSize;
    }

    @Override
    public void setSecuritySystem(String securitySystem) {
        suv.securitySystem = securitySystem;
    }

    @Override
    public void setScreenType(String screenType) {
        suv.screenType = screenType;
    }

    public SUV getProduct(){
        SUV product = this.suv;
        suv = new SUV();
        return product;
    }
}
