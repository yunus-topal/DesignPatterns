package Visitor;

public class Car implements Visitable{
    private String type;

    public Car(String type){
        this.type = type;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
