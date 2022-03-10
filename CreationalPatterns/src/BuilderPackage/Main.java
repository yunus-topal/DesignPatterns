package BuilderPackage;

public class Main {

    public static void main(String[] args) {
        FootballPlayer messi = generateFbPlayer("Messi",36,1.67,"Argentina");
        System.out.println(messi.toString());
    }

    public static FootballPlayer generateFbPlayer(String name, int age, double height, String nation){
        FpBuilder fb = new FpBuilder();
        fb.setName(name);
        fb.setAge(age);
        fb.setHeight(height);
        fb.setNation(nation);
/*        fb.setPosition("RW");
        fb.setWeight(70);
        fb.setValue(99999);*/

        return fb.getProduct();
    }


}
