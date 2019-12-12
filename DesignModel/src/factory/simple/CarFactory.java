package factory.simple;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 简单工厂
 */
public class CarFactory {
    public Car buyCar(String car) {
        Car cars = null;
        switch (car) {
            case "Benz":
                cars = new Benz();
                break;
            case "Bmw":
                cars = new Bmw();
                break;
            case "Audi":
                cars = new Audi();
                break;

        }
        return cars;
    }
}
