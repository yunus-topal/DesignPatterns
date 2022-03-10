package Visitor;

public interface Visitor {
    void visit(Jewellery jewellery);
    void visit(Book book);
    void visit(Car car);
}
