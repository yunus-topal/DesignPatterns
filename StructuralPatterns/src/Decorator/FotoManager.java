package Decorator;


public class FotoManager {
    private Sharing sharer;

    public FotoManager(Sharing s) {
        this.sharer = s;
    }

    public void share(Foto photo){
        sharer.sharePhoto(photo);
    }

    public Foto getImage(String url){
        return sharer.getPhoto(url);
    }
}
