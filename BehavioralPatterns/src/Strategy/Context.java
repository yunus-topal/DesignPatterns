package Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(int[] arr){
        strategy.execute(arr);
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
