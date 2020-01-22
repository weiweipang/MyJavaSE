package factory.abstractFactory;

public class BmwFactory implements TrafficFactory {

    @Override
    public Car createCar() {
        return new Bmw();
    }

    @Override
    public Motor createMotor() {
        return new BmwMotor();
    }
}
