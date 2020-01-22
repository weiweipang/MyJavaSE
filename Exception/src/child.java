/**
 * Created by bitsino_pww on 2019/11/27.
 */
class child extends  parent{
    static {
        System.out.println("E");

    }
    private static String name = method2();

    public child() {
        System.out.println("F");
    }

    public void method1(){
        System.out.println("G");

    }
    public static String  method2(){
        System.out.println("H");

        return "child";
    }

}
