package Mediator;

public class PlayButton implements Component{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "playButton";
    }

    public void onClick(){
        mediator.playSong();
    }
}
