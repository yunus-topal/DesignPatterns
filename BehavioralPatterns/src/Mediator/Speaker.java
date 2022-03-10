package Mediator;

public class Speaker implements Component {
    private boolean playing = false;
    private Song song;
    private Mediator mediator;
    private int volume = 0;

    public Speaker() {
    }

    public void playSong(){
        playing = !playing;
        if(playing){
            System.out.println(song.getName() + " is playing now.");
        }
        else{
            System.out.println(song.getName() + " is stopped.");
        }
    }

    public void setSong(Song song) {
        this.song = song;
        System.out.println("song is: " + song.getName());
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "speaker";
    }

    public void volumeUp(){
        volume++;
        System.out.println(String.format("Volume: %d",volume));
    }
    public void volumeDown(){
        if(volume > 0){
            volume--;
        }
        System.out.println(String.format("Volume: %d",volume));
    }
}
