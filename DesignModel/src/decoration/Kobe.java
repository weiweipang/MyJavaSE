package decoration;

/**
 * Created by bitsino-001 on 2019/6/20.
 * 被装饰类
 */
public class Kobe implements Person {
    @Override
    public void desc() {
        System.out.println("kobe是一个人");
    }
}
