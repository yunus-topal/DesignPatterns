package Mediator;

public class VolumeDownButton implements Component{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "volumeDown";
    }

    public void onClick(){
        mediator.decreaseVolume();
    }
}
