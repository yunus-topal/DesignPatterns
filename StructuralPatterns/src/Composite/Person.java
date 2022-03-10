package Composite;

public class Person implements Payable {
    private String name;
    private int salary;


    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int calculatePayment() {
        return this.salary;
    }
}
