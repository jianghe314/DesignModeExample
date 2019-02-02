package decorator_pattern;

import android.util.Log;

/*
 *Created by zx on 19-2-2
 *
 * 装饰者模式的具体组件
 */
public class SuvCar extends ComponentCar {

    @Override
    public void drive() {
        Log.e("DecoratorPattern","-->SuvCar功能更多");
    }
}
