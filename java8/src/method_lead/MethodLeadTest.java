package method_lead;

import java.util.function.Consumer;

/**
 * Created by bitsino_pww on 2019/11/28.
 * 方法引用
 * 1.使用场景：当要传递给Lambda体的操作，已经有实现的方法了，可以使用方法引用
 *            相当于找一个和 ->右侧结构一样的函数来替代掉原来的，并通过类（对象）::函数的方式引用
 */
public class MethodLeadTest {
    public static void main(String[] args) {
        Consumer<String> con = (str) -> System.out.println(str);
        con.accept("你好");

        //方法引用方式

        Consumer<String> con1 = System.out::println;
        con1.accept("世界");
    }


}
