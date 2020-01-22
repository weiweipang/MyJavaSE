package factory.abstractFactory;

public class Client {

    public static void main(String[] args) {
        TrafficFactory trafficFactory = new BmwFactory();
        Car car = trafficFactory.createCar();
        car.carName();
    }
}
