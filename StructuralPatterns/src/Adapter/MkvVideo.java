package Adapter;

public class MkvVideo {
    private String videoType;

    public MkvVideo(String videoType) {
        this.videoType = videoType;
    }

    public void playMkvVideo() {
        System.out.println("Mkv video played");
    }
}
