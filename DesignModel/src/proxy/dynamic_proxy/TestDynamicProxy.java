package proxy.dynamic_proxy;


import proxy.static_proxy.SellHouse;
import proxy.static_proxy.Seller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by bitsino-001 on 2019/5/17.
 * 演示如何实现动态代理
 *
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        //获得代理类，需要用到JDK中的 Proxy.newProxyInstance()方法
        // 在Proxy.newProxyInstance()中需要传入三个参数
      /*  public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
      *    第一个是被代理类的类加载器，第二个是被代理类实现的接口，第三个参数是用来动态调用方法的接口
      *    想必介绍到这里，熟悉java反射的朋友应该想到了，动态代理是通过反射来实现的运行时方法调用
      * */

    /*    User user = new User();
        //获得代理对象
        DaGuanSi proxy = (DaGuanSi) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //当通过代理对象调用xxx方法时就会调用下面的方法执行
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("各位好，我是代理律师");
                Object invoke = method.invoke(user,args);//这里就是通过反射执行代理类的方法，也就是间接的调用被代理类的方法
                System.out.println("本代理律师发言完毕");
                return invoke;
            }
        });

        proxy.juzheng();
        proxy.susong();*/


        Seller seller = new Seller();
        //获得代理对象
        SellHouse proxy = (SellHouse) Proxy.newProxyInstance(seller.getClass().getClassLoader(), seller.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            //当通过代理对象调用xxx方法时就会调用下面的方法执行
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("各位好，我是代理律师");
                Object invoke = method.invoke(seller,args);//这里就是通过反射执行代理类的方法，也就是间接的调用被代理类的方法
                System.out.println("本代理律师发言完毕");
                return invoke;
            }
        });

       proxy.price_house();



    }
}


