package factory.method;

import factory.sample.Car;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 抽象工厂：生产什么样的司机(抽象产品)
 */
public interface Driver {
    Car creatDriver();
}
