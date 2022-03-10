package Composite;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> IT = new ArrayList<Payable>();
        for(int i = 0; i < 8; i++){
            Random random = new Random();
            IT.add(new Person("person", random.nextInt(1000)));
        }

        ArrayList<Payable> Backend = new ArrayList<Payable>();
        for(int i = 0; i < 3; i++){
            Random random = new Random();
            Backend.add(new Person("person", random.nextInt(1000)));
        }
        Group ITTeam = new Group(IT);
        Group BackendTeam = new Group(Backend);
        ITTeam.add(BackendTeam);

        System.out.println(ITTeam.calculatePayment());
    }
}
