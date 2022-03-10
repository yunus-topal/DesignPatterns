package Proxy;

public class Book {
    private String name;
    private int id;
    private Person donator;
    private boolean isPublic;


    public Person getDonator() {
        return donator;
    }

    public Book(String name, int id, Person donator, boolean isPublic) {
        this.name = name;
        this.id = id;
        this.donator = donator;
        this.isPublic = isPublic;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getIsPublic(){
        return isPublic;
    }
}
