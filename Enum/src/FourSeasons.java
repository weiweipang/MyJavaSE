/**
 * Created by bitsino-001 on 2019/6/17.
 */
// 定义表示季节的枚举类，共有4个内部对象
class FourSeasons {

    // 定义类的属性：私有的，终态的，在构造器中进行初始化
    private final String name;

    // 将构造器私有化，使构造器不能在类的外部被使用
    private FourSeasons(String name) {
        this.name = name;
    }

    // get方法返回属性值
    public String getName() {
        return name;
    }

    // 覆盖toString方法，设置默认打印值
    public String toString() {
        return "This is " + name;
    }

    // 在类的内部创建对象
    public static final FourSeasons SPRING = new FourSeasons("spring");
    public static final FourSeasons SUMMER = new FourSeasons("summer");
    public static final FourSeasons AUTUMN = new FourSeasons("autumn");
    public static final FourSeasons WINTER = new FourSeasons("winter");

}
