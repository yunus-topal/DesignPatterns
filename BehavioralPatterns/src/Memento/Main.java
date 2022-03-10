package Memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(0, "istanbul");
        Caretaker caretaker = new Caretaker();
        caretaker.saveGame(game);

        game.setScore(10);
        game.setLocation("Ankara");
        caretaker.saveGame(game);

        game.setLocation("izmir");
        game.setScore(20);
        game.printInfo();

        game = caretaker.reloadSave(game);
        game.printInfo();

        game = caretaker.reloadSave(game);
        game.printInfo();
    }
}
