package factory.abstractFactory;

public class BenzFactory implements TrafficFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }

    @Override
    public Motor createMotor() {
        return new BenzMotor();
    }
}
