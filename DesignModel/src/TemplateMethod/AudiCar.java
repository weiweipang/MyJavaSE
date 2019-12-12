package TemplateMethod;

/**
 * Created by bitsino-001 on 2019/6/20.
 */
public class AudiCar extends  Car {
    public AudiCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("奥迪车跑");
    }
}
