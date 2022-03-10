package Bridge;

public class Screen {
    private Phone p;

    public Screen(Phone p){
        this.p = p;
    }

    public void numberOnClick(int number) {
        p.makeCall(number);
    }

    // create gui for the user.
    public void showFile(int fileId) {
        String fileInfo = p.openFile(fileId);
        // show(fileInfo);
    }

    public void openCamera() {
        p.openCamera();
    }

    public void openGallery() {
        p.showPictures();
        // showPictures();
    }
}
