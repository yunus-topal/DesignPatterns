package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("backend");
        Task t2 = new Task("frontend");

        Chain c1 = new BackendDeveloper();
        Chain c2 = new FrontendDeveloper();
        c1.setNextChain(c2);

        c1.solveBug(t1);
        c1.solveBug(t2);


    }
}
