package factory.abstractFactory;

public class BmwMotor implements Motor{
    @Override
    public void motorName() {
        System.out.println("宝马摩托");
    }
}
