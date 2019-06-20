import lambda.Dog;
import lambda.Person;
import org.junit.Test;

/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class LambdaTest {
    @Test
    public void test1() {
        Person person = () -> System.out.println("无参数无返回值的lambda表达式形式");
        person.showName();
    }
    @Test
    public void test2() {
        Dog dog = str -> str;

        String str = dog.say("旺旺");
        System.out.println(str);
		
    }



}
