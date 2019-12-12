package factory.method;


/**
 * Created by bitsino-001 on 2019/6/18.
 * 工厂实例
 */
public class Bmw4S implements Car4S {
    @Override
    public Car sellCar() {
        return new Bmw();
    }
}
