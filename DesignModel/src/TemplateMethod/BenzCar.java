package TemplateMethod;

/**
 * Created by bitsino-001 on 2019/6/20.
 */
public class BenzCar extends Car {
    public BenzCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("奔驰车跑");
    }
}
