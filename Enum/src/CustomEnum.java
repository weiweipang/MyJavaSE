/**
 * Created by bitsino-001 on 2019/6/17.
 * 枚举是jdk1.5后的新特性，之前用自定义枚举
 */
public class CustomEnum {

    public static void main(String[] args) {
        System.out.println( Season.SPRING.toString());
    }

}

//季节演示自定义枚举
class Season {
    private  String NAME = "";
    private  String DESC = "";

    public Season(String NAME, String DESC) {
        this.NAME = NAME;
        this.DESC = DESC;
    }

    public static final Season SPRING = new Season("春天", "万物复苏");
    public static final Season SUMMER = new Season("夏天", "热死个人");
    public static final Season AUTUMN = new Season("秋天", "秋风瑟瑟");
    public static final Season WINTER = new Season("冬天", "冻死个人");

    @Override
    public String toString() {
        return "Season{" +
                "NAME='" + NAME + '\'' +
                ", DESC='" + DESC + '\'' +
                '}';
    }
}
