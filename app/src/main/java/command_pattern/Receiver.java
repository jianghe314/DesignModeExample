package command_pattern;

import android.util.Log;

/**
 * Created by ZX on 2018/12/16
 *
 * 接收者，命令的执行者
 */
public class Receiver {

    public void Attack(){
        Log.i("CommandPattern","我是命令的执行者");
    }
}
