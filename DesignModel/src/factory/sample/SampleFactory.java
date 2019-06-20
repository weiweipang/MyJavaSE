package factory.sample;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 简单工厂
 */
public class SampleFactory {
    public static void main(String[] args) {
        Car car = SampleFactory.driveCar("Bmw");
        if(car!=null){
            car.driveCar();
        }
    }
    public static Car driveCar(String car){
        Car cars = null;
        switch (car){
            case "Benz":
                cars=new Benz();
                break;
            case "Bmw":
                cars=new Bmw();
                break;
            case "Audi":
                cars=new Audi();
                break;

        }
        return cars;
    }
}
