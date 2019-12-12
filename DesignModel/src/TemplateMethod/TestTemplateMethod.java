package TemplateMethod;

/**
 * Created by bitsino-001 on 2019/6/20.
 * 测试模板方法
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        AudiCar A8 = new AudiCar("奥迪A8");
        A8.company();

        BenzCar S300 = new BenzCar("奔驰S300");
        S300.company();
    }
}
