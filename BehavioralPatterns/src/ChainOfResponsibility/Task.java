package ChainOfResponsibility;

public class Task {
    private String type;

    public Task(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
