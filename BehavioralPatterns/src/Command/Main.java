package Command;

public class Main {

    public static void main(String[] args){
        ElectronicDevice newDevice = new Television();

        TurnDeviceOn onCommand = new TurnDeviceOn(newDevice);
        CommandInvoker pressedButton = new CommandInvoker(onCommand);
        pressedButton.press();

        TurnDeviceOff offCommand = new TurnDeviceOff(newDevice);
        pressedButton = new CommandInvoker(offCommand);
        pressedButton.press();


        TurnVolumeUp volUpCommand = new TurnVolumeUp(newDevice);
        pressedButton = new CommandInvoker(volUpCommand);

        pressedButton.press();
        pressedButton.pressUndo();



    }

}