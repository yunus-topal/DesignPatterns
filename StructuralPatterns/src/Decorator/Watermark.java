package Decorator;

public class Watermark extends FotoDecorator {
    public Watermark(Sharing fs) {
        super(fs);
    }

    @Override
    public void sharePhoto(Foto photo) {
        // apply watermark to photo here.
        super.sharePhoto(photo);
    }

    @Override
    public Foto getPhoto(String address) {
        // remove watermark
        return null;
    }
}
