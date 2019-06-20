package decoration;

/**
 * Created by bitsino-001 on 2019/6/20.
 * 装饰器
 */
public class PersonDecorator implements Person {
    /**
     * 持有被装饰类，以公共接口接收
     */
    Person person;
    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public void desc() {
        person.desc();
    }
}
