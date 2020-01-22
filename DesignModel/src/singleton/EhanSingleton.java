package singleton;

/**
 * 饿汉式单例
 *
 * 特点：线程安全，但容易造成内存浪费
 */
public class EhanSingleton {
    private EhanSingleton() {
    }

    private static final EhanSingleton ehanSingleton = new EhanSingleton();

    public static EhanSingleton getEhanSingleton() {
        return ehanSingleton;
    }
}
