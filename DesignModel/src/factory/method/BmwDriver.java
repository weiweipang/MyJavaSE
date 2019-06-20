package factory.method;

import factory.sample.Bmw;
import factory.sample.Car;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 工厂实例
 */
public class BmwDriver implements Driver {
    @Override
    public Car creatDriver() {
        return new Bmw();
    }
}
