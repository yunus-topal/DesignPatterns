package Decorator;

public class FotoSharer implements Sharing{
    Foto photo;

    public FotoSharer(Foto photo){
        this.photo = photo;
    }
    @Override
    public void sharePhoto(Foto photo) {
        // share photo on somewhere.
    }

    @Override
    public Foto getPhoto(String address) {
        return null;
    }
}
