package proxy.static_proxy;

/**
 * Created by bitsino-001 on 2019/5/17.
 * 实际卖方的人（被代理类）
 */
public class Seller implements SellHouse {
    @Override
    public void price_house() {
        System.out.println("我是房主，万科洋房，110平，售价150万！");
    }
}
