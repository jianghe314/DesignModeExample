package proxy_pattern;

/*
 *Created by zx on 19-1-28
 *
 * 代理类
 */
public class ProxyBuy implements IBuy{

    private IBuy iBuy;

    public ProxyBuy() {
        this.iBuy = new ConcreteBuy();
    }


    @Override
    public void buy(String aimPlace) {
        iBuy.buy(aimPlace);
    }
}
