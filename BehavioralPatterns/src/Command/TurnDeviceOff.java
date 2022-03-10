package Command;

public class TurnDeviceOff implements Command {

    ElectronicDevice theDevice;

    public TurnDeviceOff(ElectronicDevice newDevice){

        theDevice = newDevice;

    }

    public void execute() {

        theDevice.off();

    }

    public void undo() {

        theDevice.on();

    }

}