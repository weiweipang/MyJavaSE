package factory.method;


/**
 * Created by bitsino-001 on 2019/6/18.
 * 工厂方法：在简单工厂的前提下，将工厂进行抽象，并创建针对不同产品的子工厂
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        Car4S car4S = new Bmw4S();
        Car car = car4S.sellCar();
        car.carName();

    }
}
