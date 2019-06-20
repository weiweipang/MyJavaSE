package decoration;

import org.junit.Test;

/**
 * Created by bitsino-001 on 2019/6/20.
 * 装饰模式测试
 */
public class DecorationTest {
    @Test
    public void test1(){
        System.out.println("被装饰类（kobe）******************************");
        Person person = new Kobe();
        person.desc();
        System.out.println("用身高来装饰被装饰类（将近两米高的kobe）******************************");
        person = new HighPerson(new Kobe());
        person.desc();
        System.out.println("用富有来装饰被装饰类（富有的kobe）******************************");
        person = new RichPerson(new Kobe());
        person.desc();
        System.out.println("用颜值来装饰被装饰类（颜值在线的kobe）******************************");
        person = new RichPerson(new Kobe());
        person.desc();
        System.out.println("高富帅的kobe******************************");
        person = new PrettyPerson(new RichPerson(new HighPerson(new Kobe())));
        person.desc();

    }
}
