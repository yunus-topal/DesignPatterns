package Mediator;

public class Main {
    public static void main(String[] args) {
        PlaylistMediator mediator = new PlaylistMediator();

        Speaker speaker = new Speaker();
        mediator.setComponent(speaker);

        PlayButton playButton = new PlayButton();
        mediator.setComponent(playButton);

        SongButton songButton = new SongButton();
        mediator.setComponent(songButton);

        VolumeUpButton volumeUpButton = new VolumeUpButton();
        mediator.setComponent(volumeUpButton);

        VolumeDownButton volumeDownButton = new VolumeDownButton();
        mediator.setComponent(volumeDownButton);

        Song s1 = new Song("Let It Be");
        Song s2 = new Song("White Queen");

        songButton.onClick(s1);
        playButton.onClick();
        playButton.onClick();
        volumeUpButton.onClick();


    }
}
