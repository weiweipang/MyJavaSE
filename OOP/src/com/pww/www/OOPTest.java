package com.pww.www;

/**
 * Created by bitsino_pww on 2019/11/28.
 * 1.类及类的成员：属性、方法、构造器、代码块、内部类
 * 2.三大特征：封装、继承、多态
 *
 */
public class OOPTest {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        show(strings);
        new Test();
    }
    public static void show(String ... str){
        for (String s : str) {
            System.out.println(s);
        }
    }

}
class Test{
    public Test() {
        System.out.println("构造方法");
    }

    {
        System.out.println("代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}