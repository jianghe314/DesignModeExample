package command_pattern;

/**
 * Created by ZX on 2018/12/16
 *
 * Command接口的实现类,负责执行具体的命令任务
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.Attack();
    }
}
