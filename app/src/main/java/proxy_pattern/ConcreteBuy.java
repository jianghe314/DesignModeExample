package proxy_pattern;

import android.util.Log;

/*
 *Created by zx on 19-1-28
 *
 * 具体主题
 */
public class ConcreteBuy implements IBuy{


    @Override
    public void buy(String aimPlace) {
        Log.e("ProxyPattern","-->购买去往"+aimPlace+"的票成功！");
    }
}
