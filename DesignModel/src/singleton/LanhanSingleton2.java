package singleton;

/**
 * 懒汉式
 *
 * 要解决双重检查锁模式带来空指针异常的问题，只需要使用 volatile 关键字, volatile 关
 * 键字可以保证可见性和有序性。
 *
 * 添加 volatile 关键字之后的双重检查锁模式是一种比较好的单例实现模式，能够保证在多线程
 * 的情况下线程安全也不会有性能问题。
 */
public class LanhanSingleton2 {


    private static volatile LanhanSingleton2 lanhanSingleton;

    private LanhanSingleton2() {
    }

    public static LanhanSingleton2 getLanhanSingleton() {
        if (lanhanSingleton == null) {
            synchronized (LanhanSingleton2.class){
                if(lanhanSingleton == null){

                    lanhanSingleton = new LanhanSingleton2();
                }
            }
        }
        return lanhanSingleton;
    }

}
