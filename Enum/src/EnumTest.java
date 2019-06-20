/**
 * Created by bitsino-001 on 2019/6/17.
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Seasons.SPRING);
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
        }

        System.out.println(Seasons.valueOf("SUMMER"));
    }
}

enum Seasons{
    SPRING("春天","万物复苏"),SUMMER("夏天","热死个人"),AUTUMN("秋天","秋风瑟瑟"),WINTER("冬天","冻死个人");

    private final String name;
    private final String desc;

    private Seasons(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}