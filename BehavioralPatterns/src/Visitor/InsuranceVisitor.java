package Visitor;

public class InsuranceVisitor implements Visitor{
    public InsuranceVisitor(){

    }

    @Override
    public void visit(Jewellery jewellery) {
        System.out.println("Show insurance plans for jewellery store");
    }

    @Override
    public void visit(Book book) {
        System.out.println("Show insurance plans for jewellery store");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Show insurance plans for jewellery store");
    }
}
