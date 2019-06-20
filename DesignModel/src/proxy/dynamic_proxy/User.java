package proxy.dynamic_proxy;

/**
 * Created by bitsino-001 on 2019/5/17.
 * 一个普通的用户，需要请律师代理他打官司
 */
public class User implements DaGuanSi {
    @Override
    public void juzheng() {
        System.out.println("用户请律师帮忙举证");
    }

    @Override
    public void susong() {
        System.out.println("用户请律师帮忙诉讼");
    }
}
