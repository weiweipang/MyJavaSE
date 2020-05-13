package stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bitsino_pww on 2019/11/28.
 */
public class StreamTest {


    //1、通过集合创建Stream
    @Test
    public void test0() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        //①.通过集合创建顺序stream
        Stream<String> stream = list.stream();

        //②.通过集合创建并行stream
        Stream<String> stringStream = list.parallelStream();
    }

    /**
     * 通过数组创建Stream
     */
    @Test
    public void test1() {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);

    }

    /**
     * 通过Stream的of方法创建Stream实例
     */
    @Test
    public void test2() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    //2、中间操作

    /**
     * 2.1筛选与切片
     */
    @Test
    public void test3() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("aa");

        //filter:从集合中排除某些元素
        list.stream().filter(str -> !str.equals("aa")).forEach(System.out::println);
        System.out.println("---------------------分割线-------------------------");
        //limit:阶段流，使元素不超过某个个数
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("---------------------分割线-------------------------");
        //skip:跳过指定个数的数据
        list.stream().skip(1).forEach(System.out::println);
        System.out.println("---------------------分割线-------------------------");
        //distinct:去重
        list.stream().distinct().forEach(System.out::println);




    }

    /**
     * 2.2映射
     */

    @Test
    public void test4() {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
    }


    /**
     * 2.3排序
     */
    @Test
    public void test5() {
//        sorted()--自然排序(Comparable)
//        sorted(Comparator com)--定制排序（Comparator）
        //这里演示定制排序：按年龄从小到大排序
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));

        personList.stream().sorted((p1,p2)->{
           return p1.getAge()-p2.getAge();
        }).forEach(System.out::println);

    }


    //3.终止操作

    /**
     * 收集
     */
    @Test
    public void test6() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));
        personList.stream().map(p-> {
            p.setCountry("CHN");
            return p;
        }).collect(Collectors.toList()).forEach(System.out::println);
    }


}
