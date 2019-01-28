package command_pattern;

/**
 * Created by ZX on 2018/12/16
 *
 * 请求者模式
 * 名词解释：将一个请求分装为一个对象，从而使用户可以用不同的请求对客户进行参数化，对请求排队或者记录请求日志，以及支持可撤销的操作。
 * 以上解释是引自GOF所著的《Design Pattern》对命令模式的高度概括。
 *
 * 简单的说就是一个对象请求另一个对象并调用其方法完成某项任务的一种成熟模式
 * 该模式涉及到四个角色
 * 1.接收者(Receiver):是实际负责执行与请求相关的操作
 * 2.命令接口(Command):规定了需要执行的某种操作的抽象方法
 * 3.具体命令(ConcreteCommand)：该类是命令接口的实现类，负责执行具体的操作
 * 4.请求者(Invoker)：一个包含了Command接口变量的类的实例，负责调用具体命令
 * UML图参见互联网
 *
 * 模式分析：
 *  * 优点：
 *  * 1.命令模式中，请求者不直接与接收者交互，即请求者不包含接收者的引用，因此彻底消除了彼此之间的耦合
 *  * 2.命令模式满足开闭原则，增加新的具体命令和该命令的接收者不必修改调用者的代码，调用者就可以使用新的命令对象，而新增调用者也不必修改
 *  *   现有具体命令和接收者.....
 *
 *
 * 下面以具体例子指挥官发送指令偷袭敌人为例说明
 *
 */
public class CommandPattern {


    public void sendCommand(){
        //创建接收者
        Receiver commandReceiver=new Receiver();
        //创建命令
        Command command=new ConcreteCommand(commandReceiver);
        //创建指挥官，发送命令
        Invoker commandInvoker=new Invoker();
        commandInvoker.setCommand(command);
        commandInvoker.startExecuteCommand();
    }



}
