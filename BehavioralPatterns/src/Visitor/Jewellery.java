package Visitor;

public class Jewellery implements Visitable{
    private int price;

    public Jewellery(int price){
        this.price = price;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
