package factory.method;


/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class Benz4S implements Car4S {
    @Override
    public Car sellCar() {
        return new Benz();
    }
}
