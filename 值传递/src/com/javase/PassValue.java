package com.javase;

/**
 * Created by bitsino_pww on 2019/9/5.
 * 值传递！
 * 方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值
 */
public class PassValue {
//    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        System.out.println(a);
//        System.out.println(b);
//        change(a, b);
//        System.out.println(a);
//        System.out.println(b);
//    }
//    public static void change(int a, int b) {
//        a = a + b;
//        b = b + a;
//    }
    //打印结果
    //            1
    //            2
    //            1
    //            2

    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr) {
        arr[0] = 200;
    }
    //打印结果
    //1
    //200
}
