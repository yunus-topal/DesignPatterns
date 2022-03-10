package Mediator;

public class SongButton implements Component{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "songButton";
    }

    public void onClick(Song s){
        mediator.setSong(s);
    }
}
