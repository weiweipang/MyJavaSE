package stream;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by bitsino_pww on 2019/11/28.
 *
 */
public class StreamTest {


    //一、通过集合创建Stream
        @Test
        public void test0(){
            List<String> list = new ArrayList<>();
            list.add("aa");
            list.add("bb");
            list.add("cc");

            //1.通过集合创建顺序stream
            Stream<String> stream = list.stream();

            //2.通过集合创建并行stream
            Stream<String> stringStream = list.parallelStream();
        }

        //通过数组创建Stream
        @Test
        public void test1(){
            int[] arr = {1,2,3,4,5};
            IntStream stream = Arrays.stream(arr);

        }

        //通过Stream的of方法创建Stream实例
        @Test
        public void test2(){
            Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);
        }
    //二、中间操作
        //1.筛选与切片
        @Test
        public void test3(){
            List<String> list = new ArrayList<>();
            list.add("aa");
            list.add("bb");
            list.add("cc");
            Stream<String> stream = list.stream();
            //filter:从集合中排除某些元素
            stream.filter(str -> !str.equals("aa")).forEach(System.out::println);
            //limit:阶段流，使元素不超过某个个数
            list.stream().limit(2).forEach(System.out::println);
            //skip:跳过指定数据
            list.stream().skip(2).forEach(System.out::println);
            //distinct:去重
            list.stream().distinct().forEach(System.out::println);
        }
        //2.映射
        @Test
        public void test4(){
            List<String> list = Arrays.asList("a","b","c");
            list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
        }

}
