package ChainOfResponsibility;

public class FrontendDeveloper implements Chain {
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void solveBug(Task task) {
        if(task.getType().equals("frontend")){
            System.out.println("Bug is solved by frontend");
        }
        else {
            nextChain.solveBug(task);
        }
    }
}
