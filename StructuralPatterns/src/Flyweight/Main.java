package Flyweight;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Crowd crowd = new Crowd();
        Random random = new Random();
        for(int i = 0; i<5; i++){
            crowd.createPerson(1,"sprite1",175,80,random.nextInt(5), random.nextInt(5));
        }
        for(int i = 0; i<5; i++){
            crowd.createPerson(2,"sprite2",180,85,random.nextInt(3), random.nextInt(7));
        }

        crowd.crowdInformation();

    }
}
