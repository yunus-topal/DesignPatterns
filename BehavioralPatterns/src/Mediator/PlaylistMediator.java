package Mediator;

import java.util.ArrayList;

public class PlaylistMediator implements Mediator{
    private Speaker speaker;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;
    private PlayButton playButton;
    private SongButton songButton;

    public void setComponent(Component c){
        c.setMediator(this);
        switch (c.getName()){
            case "speaker":
                this.speaker = (Speaker) c;
                break;
            case "volumeDown":
                this.volumeDownButton = (VolumeDownButton) c;
                break;
            case "volumeUp":
                this.volumeUpButton = (VolumeUpButton) c;
                break;
            case "playButton":
                this.playButton = (PlayButton) c;
                break;
            case "songButton":
                this.songButton = (SongButton) c;
                break;
        }
    }

    @Override
    public void playSong() {
        speaker.playSong();
    }

    @Override
    public void setSong(Song song){
        speaker.setSong(song);
    }

    @Override
    public void increaseVolume() {
        speaker.volumeUp();
    }

    @Override
    public void decreaseVolume() {
        speaker.volumeDown();
    }
}
