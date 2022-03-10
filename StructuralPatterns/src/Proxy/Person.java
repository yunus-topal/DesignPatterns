package Proxy;

public class Person {
    private String name;
    private int id;
    private boolean staff;

    public Person(String name, int id, boolean staff) {
        this.name = name;
        this.id = id;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean isStaff() {
        return staff;
    }
}
