package Visitor;

public class Book implements Visitable{
    private String name;

    public Book(String name){
        this.name = name;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
