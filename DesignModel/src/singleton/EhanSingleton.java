package singleton;

/**
 * 饿汉式单例（静态成员变量方式）
 *
 * 特点：线程安全，但容易造成内存浪费
 *
 * 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
 * instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存
 * 的浪费
 */
public class EhanSingleton {
    private EhanSingleton() {
    }

    private static final EhanSingleton ehanSingleton = new EhanSingleton();

    public static EhanSingleton getEhanSingleton() {
        return ehanSingleton;
    }
}
