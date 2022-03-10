package ChainOfResponsibility;

public class BackendDeveloper implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void solveBug(Task task) {
        if(task.getType().equals("backend")){
            System.out.println("Bug is solved by backend");
        }
        else {
            nextChain.solveBug(task);
        }
    }
}
