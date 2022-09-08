package CommandModel;

/**
 * 命令接口
 *
 * @name: easyTest.CommandModel.Command
 * @author: yoga
 * @create: 2022-09-07 15:02
 **/
public interface Command {
    public void execute();
    public void undo();
}
