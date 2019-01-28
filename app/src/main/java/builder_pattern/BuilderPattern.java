package builder_pattern;

/*
 *Created by zx on 19-1-27
 *
 * 建造者模式
 * 名词解释：将一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表示。
 * 以上解释是引自GOF所著的《Design Pattern》对建造者模式的高度概括。
 *
 * 建造者模式有名生成器模式，其结果包括四个角色
 * 1.产品(Product):具体要创建的复杂对象
 * 2.抽象建造者(Builder):抽象生成器是一个接口(或者抽象类)，该接口除了位创建一个Product对象的各个组件定义了若干个方法外,还定义了返回的Product对象方法。
 * 3.具体建造者(ConcreteBuilder):实现Builder接口，并实现相关定义的方法。
 * 4.指挥者(Director):该类包含有Buidler接口声明的变量，根据用户的请求指挥者请求具体生成器来构造用户所需要的对象。
 * UML图参见互联网
 *
 * 模式分析：
 * 优点：
 * 1.建造者模式将对象的构造封装的具体建造者中，调用者使用不同的生成器就能得到该对象的不同表示了。
 * 2.建造者模式将对象的创建从创建该对象的类中分离出来，是用户无需关心该 对象的具体组件。
 * 3.可以更加精细有效的控制对象的构造过程，创建者模式将创建对象的过程分解成若干个步骤中，使得创建过程更加精细和有效控制了。
 * 4.满足开闭原则，将对象的创建与创建该对象的类解耦，是对象的创建更加灵活有弹性。
 *
 * 下面以组装台式电脑为例说明
 *
 *
 */
public class BuilderPattern {

    public BuilderPattern() {
        Builder builder=new ConcreteBuilder();
        Director director=new Director(builder);
        director.CreateCompter("Intel","华硕","金士顿8G");
    }

}
