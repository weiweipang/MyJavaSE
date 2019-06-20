package proxy.static_proxy;

/**
 * Created by bitsino-001 on 2019/5/17.
 */
public class TestProxy {
    public static void main(String[] args) {
        SellHouse sellHouse = new Zhongjie();
        sellHouse.price_house();
    }
}
