package Flyweight;

import java.util.ArrayList;

public class Crowd {
    private ArrayList<Person> people = new ArrayList<Person>();

    public void createPerson(int id,String sprite, int height, int weight, int x, int y ) {
        PersonType personType = PersonFactory.getPersonType(id, sprite, height, weight);
        Person person = new Person(x, y, personType);
        people.add(person);
    }
    public void createPerson(PersonType personType,int x, int y){
        Person person = new Person(x,y,personType);
        people.add(person);
    }

    public void crowdInformation() {
        // draw crowd on screen.
        for(Person person: people){
            person.printInformation();
            System.out.println();
        }
    }
}
