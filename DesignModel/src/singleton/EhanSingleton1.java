package singleton;

/**
 * 饿汉式单例（静态代码块方式）
 *
 * 特点：线程安全，但容易造成内存浪费
 *
 * 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着
 * 类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题
 */
public class EhanSingleton1 {
    private EhanSingleton1() {
    }

    private static EhanSingleton1 ehanSingleton = null;

    static {
        ehanSingleton = new EhanSingleton1();
    }

    public static EhanSingleton1 getEhanSingleton() {
        return ehanSingleton;
    }
}
