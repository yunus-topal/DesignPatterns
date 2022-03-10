package Memento;

public class Game {
    private int score;
    private String location;

    public Game(int score, String location) {
        this.score = score;
        this.location = location;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Snapshot saveGame(){
        return new Snapshot(this, score,location);
    }
    public void printInfo(){
        System.out.println(score);
        System.out.println(location);
    }
}
