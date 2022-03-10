package CarBuilderPackage;

public class Main {
    public static void main(String[] args) {
        SUV s1 = suvStarter(2020, 5, "2.0 TDI", "dizel", 50);
        System.out.println(s1);

        System.out.println();

        SUV s2 = suvFull(2020, 5, "2.0 TDI", "dizel", 50, "paket1","Yol Bilgisayarı");
        System.out.println(s2);
    }
    public static SUV suvStarter(int year, int seatNum, String engine, String fuel, int fuelTankSize) {
        SUVBuilder sb = new SUVBuilder();
        sb.setYear(year);
        sb.setSeatNum(seatNum);
        sb.setEngine(engine);
        sb.setFuel(fuel);
        sb.setFuelTankSize(fuelTankSize);

        return sb.getProduct();
    }
    public static SUV suvFull(int year, int seatNum, String engine, String fuel, int fuelTankSize, String security, String screen){
        SUVBuilder sb = new SUVBuilder();
        sb.setYear(year);
        sb.setSeatNum(seatNum);
        sb.setEngine(engine);
        sb.setFuel(fuel);
        sb.setFuelTankSize(fuelTankSize);
        sb.setSecuritySystem(security);
        sb.setScreenType(screen);

        return sb.getProduct();
    }
}
