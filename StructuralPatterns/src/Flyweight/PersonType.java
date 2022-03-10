package Flyweight;

public class PersonType {
    public int getId() {
        return id;
    }

    private int id;
    private String sprite;
    private int height;
    private int weight;

    public PersonType(int id, String sprite, int height, int weight) {
        this.id = id;
        this.sprite = sprite;
        this.height = height;
        this.weight = weight;
    }
    public void drawPerson(int x, int y){
        // draw person with x, y name and other information.
    }
}
