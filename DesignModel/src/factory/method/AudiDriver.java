package factory.method;

import factory.sample.Audi;
import factory.sample.Car;

/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class AudiDriver implements Driver {
    @Override
    public Car creatDriver() {
        return new Audi();
    }
}
