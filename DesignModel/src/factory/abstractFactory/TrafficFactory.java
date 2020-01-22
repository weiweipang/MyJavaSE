package factory.abstractFactory;

/**
 * 抽象工厂是对单个工厂的进一步抽象，可以理解为生成工厂的工厂
 *
 * 交通工具的工厂：生产摩托工厂、汽车工厂
 */
public interface TrafficFactory {
    Car createCar();
    Motor createMotor();

}
