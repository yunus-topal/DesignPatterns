package Proxy;

public class Main {
    public static void main(String[] args) {
        LibraryProxy lp = new LibraryProxy();
        Person p1 = new Person("Ahmet",1, true);
        Person p2 = new Person("Mehmet", 2, false);

        Book b1 = new Book("Budala",1,p1,true);
        Book b2 = new Book("Kumarbaz",2,p1,false);
        Book b3 = new Book("Karamazov Kardeşler",3,p2,true);
        lp.addBook(b1);
        lp.addBook(b2);
        lp.addBook(b3);

        System.out.println();

        lp.viewBook(b1,p1);
        lp.viewBook(b2,p1);
        lp.viewBook(b1,p2);
        lp.viewBook(b2,p2);
    }
}
