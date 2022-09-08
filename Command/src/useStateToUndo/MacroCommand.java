package useStateToUndo;

/**
 * @name: MacroCommand
 * @author: yoga
 * @create: 2022-09-08 11:09
 **/
public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute(){
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
