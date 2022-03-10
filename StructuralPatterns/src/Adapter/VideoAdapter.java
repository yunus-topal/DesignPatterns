package Adapter;

public class VideoAdapter implements Video{
    private MkvVideo movVideo;

    public VideoAdapter(MkvVideo movVideo) {
        this.movVideo = movVideo;
    }

    @Override
    public void playMp4Video() {
        movVideo.playMkvVideo();
    }
}
