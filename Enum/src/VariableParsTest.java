/**
 * Created by bitsino-001 on 2019/6/17.
 * 可变参数测试,实际是将传入的多个参数封装成数组
 */

public class VariableParsTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.info("tom","12","男");
    }
}

class Person {
    public  void info(String ... info){
        for (String s : info) {

            System.out.println(s);
        }
    }
}