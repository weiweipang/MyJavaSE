package factory.simple;

/**
 * 简单工厂客户端
 */
public class SimpleFactoryClient {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.buyCar("Benz");
        car.carName();
    }
}
