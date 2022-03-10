package Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Snapshot> saves;


    public Caretaker() {
        saves = new Stack<>();
    }

    public void saveGame(Game game){
        Snapshot snapshot = game.saveGame();
        saves.push(snapshot);
    }

    public Game reloadSave(Game game){
        if(saves.empty()){
            return game;
        }
        else {
            Snapshot lastSave = saves.pop();
            return lastSave.reload();
        }
    }

}
