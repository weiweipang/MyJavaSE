package decoration;

/**
 * Created by bitsino-001 on 2019/6/20.
 */
public class PrettyPerson extends PersonDecorator {
    public PrettyPerson(Person person) {
        super(person);
    }

    @Override
    public void desc() {
        super.desc();
        System.out.println("是一个帅人");
    }
}
