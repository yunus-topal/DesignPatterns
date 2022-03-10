package Decorator;

public class FotoDecorator implements Sharing {
    private Sharing fs;

    public FotoDecorator(Sharing fs){
        this.fs = fs;
    }


    @Override
    public void sharePhoto(Foto photo) {
        fs.sharePhoto(photo);
    }

    @Override
    public Foto getPhoto(String address) {
        return null;
    }
}
