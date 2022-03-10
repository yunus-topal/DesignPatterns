package CarBuilderPackage;

public class SedanBuilder implements Builder{
    private Sedan sedan;

    public SedanBuilder(){
        this.sedan = new Sedan();
    }
    @Override
    public void setYear(int year) {
        sedan.year = year;
    }

    @Override
    public void setSeatNum(int seatNum) {
        sedan.seatNum = seatNum;
    }

    @Override
    public void setEngine(String engine) {
        sedan.engine = engine;
    }

    @Override
    public void setFuel(String fuel) {
        sedan.fuel = fuel;
    }

    @Override
    public void setFuelTankSize(int fuelTankSize) {
        sedan.fuelTankSize = fuelTankSize;
    }

    @Override
    public void setSecuritySystem(String securitySystem) {
        sedan.securitySystem = securitySystem;
    }

    @Override
    public void setScreenType(String screenType) {
        sedan.screenType = screenType;
    }

    public Sedan getProduct(){
        Sedan product = this.sedan;
        sedan = new Sedan();
        return product;
    }
}
