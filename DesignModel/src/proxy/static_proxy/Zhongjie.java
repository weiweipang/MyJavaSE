package proxy.static_proxy;

/**
 * Created by bitsino-001 on 2019/5/17.
 * 中介代理类
 */
public class Zhongjie implements SellHouse {
    //
    Seller seller = new Seller();

    @Override
    public void price_house() {
        System.out.println("我是房屋中介，房主急售！");
        seller.price_house();
    }
}
