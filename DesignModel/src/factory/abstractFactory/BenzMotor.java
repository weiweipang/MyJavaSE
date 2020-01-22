package factory.abstractFactory;

public class BenzMotor implements Motor{
    @Override
    public void motorName() {
        System.out.println("奔驰摩托");
    }
}
