package singleton;

/**
 * 懒汉式
 *
 * 第一次加载LanhanSingleton3类时不会去初始化INSTANCE，只有第一次调用getInstance，虚拟机加
 * 载SingletonHolder
 * 并初始化INSTANCE，这样不仅能确保线程安全，也能保证 Singleton 类的唯一性
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。在没有加任
 * 何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费
 *
 */
public class LanhanSingleton3 {


    //私有构造方法
    private LanhanSingleton3() {
    }

    private static class SingletonHolder {
        private static final LanhanSingleton3 INSTANCE = new LanhanSingleton3();
    }

    //对外提供静态方法获取该对象
    public static LanhanSingleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
