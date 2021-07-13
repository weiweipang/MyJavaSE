package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //测试饿汉式
//        EhanSingleton ehanSingleton = EhanSingleton.getEhanSingleton();
//        EhanSingleton ehanSingleton1 = EhanSingleton.getEhanSingleton();
//        System.out.println(ehanSingleton==ehanSingleton1);
        //测试懒汉式
        LanhanSingleton lanhanSingleton = LanhanSingleton.getLanhanSingleton();
        LanhanSingleton lanhanSingleton1 = LanhanSingleton.getLanhanSingleton();
        System.out.println(lanhanSingleton==lanhanSingleton1);


        //枚举懒汉单例测试
        LanhanSingleton4 lanhanSingleton4 = LanhanSingleton4.LANHAN_SINGLETON_4;
        LanhanSingleton4 lanhanSingleton41 = LanhanSingleton4.LANHAN_SINGLETON_4;
        System.out.println(lanhanSingleton4==lanhanSingleton41);


    }
}
