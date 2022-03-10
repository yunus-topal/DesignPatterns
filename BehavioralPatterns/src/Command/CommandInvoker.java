package Command;

public class CommandInvoker {

    Command theCommand;

    public CommandInvoker(Command newCommand){
        theCommand = newCommand;
    }

    public void press(){
        theCommand.execute();
    }

    public void pressUndo(){
        theCommand.undo();
    }

}