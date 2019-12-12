package lambda;

import lambda.Dog;
import lambda.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class LambdaTest {


    @Test
    public void test0(){
        /**
         * lambda表达式演变
         *
         *  ->左边是接口中抽象方法的形参列表
         *  ->右边是重写接口抽象方法
         */

        //1.抽象方法无参数无返回值
        Runnable runnable = () -> System.out.println("无参无返回值的lambda表达式");
        new Thread(runnable).start();


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare = comparator.compare(12, 15);
        System.out.println(compare);
        System.out.println("*********************************************");


        Comparator<Integer> comparator1 = (o1,o2) -> Integer.compare(o1,o2);
        int compare1 = comparator1.compare(16, 13);
        System.out.println(compare1);
    }

    @Test
    public void test1() {
        Person person = () -> System.out.println("无参数无返回值的lambda表达式形式");
        person.showName();
    }
    @Test
    public void test2() {
        Dog dog = (str) -> str;

        String str = dog.say("旺旺");
        System.out.println(str);

    }




}
