package lambda;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 只有一个抽象方法的接口称为函数式接口，可以用@FunctionalInterface校验
 */
@FunctionalInterface
public interface Person {
    //无参数无返回值
    void showName();
}
