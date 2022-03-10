package Decorator;

public class ColorFilter extends FotoDecorator {
    public ColorFilter(Sharing fs) {
        super(fs);
    }

    @Override
    public void sharePhoto(Foto photo) {
        //apply color filter to photo here.
        super.sharePhoto(photo);
    }

    @Override
    public Foto getPhoto(String url) {
        // apply reverse color filter.
        return null;
    }
}
