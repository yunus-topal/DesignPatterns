package Mediator;

public class VolumeUpButton implements Component{
    private Mediator mediator;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "volumeUp";
    }

    public void onClick(){
        mediator.increaseVolume();
    }
}
