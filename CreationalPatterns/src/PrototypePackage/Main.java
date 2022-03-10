package PrototypePackage;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Sedan s1 = new Sedan();
        s1.model = "mercedes";
        s1.price = 500000;
        s1.year = 2022;
        s1.screenType = "screen";

        Sedan s2 = new Sedan();
        s2.model = "mazda";
        s2.price = 450000;
        s2.year = 2021;
        s2.screenType = "screen";


        Truck t = new Truck();
        t.model = "dodge";
        t.price = 300000;
        t.year = 2020;
        t.capacity = 50000;

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(s1);
        cars.add(s2);
        cars.add(t);
        spawnManager(cars);
    }

    public static void spawnManager(ArrayList<Car> cars){
        Random random = new Random();
        while (true){
            int x = random.nextInt(cars.size());
            System.out.println("Spawned car:");
            System.out.println(cars.get(x).model);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
