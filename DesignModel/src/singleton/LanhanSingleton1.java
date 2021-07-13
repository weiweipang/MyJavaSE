package singleton;

/**
 * 懒汉式
 *
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，上面的双重检
 * 测锁模式看上去完美无缺，其实是存在问题，在多线程的情况下，可能会出现空指针问题，出现问
 * 题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作
 */
public class LanhanSingleton1 {


    private static LanhanSingleton1 lanhanSingleton;

    private LanhanSingleton1() {
    }

    public static LanhanSingleton1 getLanhanSingleton() {
        if (lanhanSingleton == null) {
            synchronized (LanhanSingleton1.class){
                //抢到锁之后再次判断是否为null
                if(lanhanSingleton == null){

                    lanhanSingleton = new LanhanSingleton1();
                }
            }
        }
        return lanhanSingleton;
    }

}
