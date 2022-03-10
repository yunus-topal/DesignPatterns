package Proxy;

public class LibraryProxy implements LibraryService{
    private Library library;
    @Override
    public void addBook(Book b) {
        // only staff can add new books
        if(!b.getDonator().isStaff()){
            System.out.println("Only staff members can donate books.");
        }
        else {
            getLibrary().addBook(b);
        }

    }

    @Override
    public void viewBook(Book b, Person p) {
        if(b.getIsPublic()){
            getLibrary().viewBook(b,p);
        }
        else{
            if(p.isStaff()){
                getLibrary().viewBook(b,p);
            }
            else{
                System.out.println("You don't have access to this book");
            }
        }
    }

    private Library getLibrary(){
        if(library == null){
            library = new Library();
        }
        return library;
    }
}
