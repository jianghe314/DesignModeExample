package decorator_pattern;

/*
 *Created by zx on 19-2-2
 *
 * 装饰者模式装饰类
 */
public abstract class DecoratorCar extends ComponentCar{

    private ComponentCar componentCar;

    public DecoratorCar(ComponentCar componentCar) {
        this.componentCar = componentCar;
    }

    @Override
    public void drive() {
        componentCar.drive();
    }
}
