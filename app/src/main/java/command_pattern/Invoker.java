package command_pattern;

/**
 * Created by ZX on 2018/12/16
 *
 * 命令模式的请求者
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void startExecuteCommand(){
        command.execute();
    }
}
