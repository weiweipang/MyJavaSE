package singleton;

/**
 * 懒汉式
 */
public class LanhanSingleton {
    //这种懒汉式存在线程安全问题
//    private static LanhanSingleton lanhanSingleton;
//
//    private LanhanSingleton() {
//    }
//
//    public static LanhanSingleton getLanhanSingleton() {
//        if (lanhanSingleton==null) {
//            lanhanSingleton = new LanhanSingleton();
//        }
//        return lanhanSingleton;
//    }

    private static volatile LanhanSingleton lanhanSingleton;

    private LanhanSingleton() {
    }

    public static LanhanSingleton getLanhanSingleton() {
        if (lanhanSingleton == null) {
            synchronized (LanhanSingleton.class){
                if(lanhanSingleton == null){

                    lanhanSingleton = new LanhanSingleton();
                }
            }
        }
        return lanhanSingleton;
    }

}
