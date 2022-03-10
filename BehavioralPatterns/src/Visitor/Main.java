package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Visitor visitor = new InsuranceVisitor();

        List<Visitable> objects = new ArrayList<>();
        Visitable b1 = new Book("book1");
        Visitable c1 = new Car("sedan");
        objects.add(b1);
        objects.add(c1);

        for(int i = 0; i < objects.size(); i++){
            objects.get(i).accept(visitor);
        }
    }
}
