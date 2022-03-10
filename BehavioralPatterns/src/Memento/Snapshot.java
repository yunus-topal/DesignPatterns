package Memento;

public class Snapshot {
    private Game game;
    private int score;
    private String location;


    public Snapshot(Game game, int score, String location) {
        this.game = game;
        this.score = score;
        this.location = location;
    }

    public Game reload(){
        game.setLocation(location);
        game.setScore(score);
        return game;
    }
}
