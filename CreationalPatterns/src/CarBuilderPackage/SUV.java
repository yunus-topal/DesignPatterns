package CarBuilderPackage;

public class SUV {
    public int year;
    public int seatNum;
    public String engine;
    public String fuel;
    public int fuelTankSize;
    public String securitySystem;
    public String screenType;

    @Override
    public String toString(){
        String str = "";
        str += "Year: " + this.year;
        str += "\nSeat Number: " + this.seatNum;
        str += "\nEngine: " + this.engine;
        str += "\nFuel: " + this.fuel;
        str += "\nFuel Tank Size: " + this.fuelTankSize;
        if(this.securitySystem != null)
            str += "\nSecurity System: " + this.securitySystem;
        if(this.screenType != null)
            str += "\nScreen Type: " + this.screenType;
        return str;
    }
    public SUV(){

    }
}
