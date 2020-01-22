/**
 * Created by bitsino_pww on 2019/11/27.
 */
public class parent {
    private static String name = method2();

    public parent() {
        System.out.println("A");
    }
    static {
        System.out.println("B");
    }

    public void method1(){
        System.out.println("C");

    }
    public static String  method2(){
        System.out.println("D");

        return "parent";
    }
}

