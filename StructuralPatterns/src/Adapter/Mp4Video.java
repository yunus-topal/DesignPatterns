package Adapter;

public class Mp4Video implements Video{
    private String videoType;

    public Mp4Video(String videoType) {
        this.videoType = videoType;
    }

    @Override
    public void playMp4Video() {
        System.out.println("Mp4 video played");
    }
}
