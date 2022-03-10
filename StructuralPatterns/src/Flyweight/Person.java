package Flyweight;

public class Person {
    private int x;
    private int y;
    private PersonType personType;


    public Person(int x, int y, PersonType personType) {
        this.x = x;
        this.y = y;
        this.personType = personType;
    }

    public void printInformation(){
        System.out.println("Person information: ");
        System.out.println(String.format("x, y coordinates: %d, %d",x,y));
        System.out.println(String.format("Person Type id: %d",personType.getId()));
    }

}
