package Bridge;

public class IOS implements Phone{
    @Override
    public void makeCall(int number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public String openFile(int id) {
        // open a file and return its content
        return "";
    }

    @Override
    public void openCamera() {
        System.out.println("Camera opened by iphone");
    }

    @Override
    public void showPictures() {
        System.out.println("Gallery opened by iphone");
    }
}
