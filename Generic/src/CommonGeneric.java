import java.util.List;

/**
 * Created by bitsino-001 on 2019/6/17.
 * 通配符泛型是基于泛型的基础之上的直接在类中使用<? extends xxx> 会报错
 */
public class CommonGeneric<T extends Person> {
    List<? extends Person> list;
}
