package Adapter;

public class Main {
    public static void main(String[] args) {
        MkvVideo movVideo = new MkvVideo("movie1.mov");
        Mp4Video mp4Video = new Mp4Video("movie2.mp4");
        VideoAdapter va = new VideoAdapter(movVideo);

        va.playMp4Video();
        mp4Video.playMp4Video();
    }
}
