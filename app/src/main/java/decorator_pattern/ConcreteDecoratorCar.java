package decorator_pattern;

import android.util.Log;

/*
 *Created by zx on 19-2-2
 *
 * 装饰者模式的具体实现类
 */
public class ConcreteDecoratorCar extends DecoratorCar{

    public ConcreteDecoratorCar(ComponentCar componentCar) {
        super(componentCar);
    }

    @Override
    public void drive() {
        super.drive();
        SuvDrive();
    }

    private void SuvDrive(){
        Log.e("DecoratorPattern","-->ConcreteDecoratorCar");
    }
}
