package Composite;

import java.util.ArrayList;

public class Group implements Payable{
    private ArrayList<Payable> childs;


    public Group(ArrayList<Payable> childs) {
        this.childs = childs;
    }

    @Override
    public int calculatePayment() {
        int totalPayment = 0;
        for(Payable p: childs){
            totalPayment += p.calculatePayment();
        }
        return totalPayment;
    }

    public void add(Payable p){
        this.childs.add(p);
    }
}
