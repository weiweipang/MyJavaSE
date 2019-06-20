package factory.method;

import factory.sample.Car;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 工厂方法：在简单工厂的前提下，将工厂进行抽象，并创建针对不同产品的子工厂
 */
public class AbstactFactory {
    public static void main(String[] args) {
        Driver driver = new BmwDriver();
        Car car = driver.creatDriver();
        car.driveCar();
    }
}
