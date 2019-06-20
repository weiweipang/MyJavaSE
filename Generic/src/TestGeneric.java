import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bitsino-001 on 2019/6/17.
 */
public class TestGeneric {
    @Test
    /**
     * 测试类的泛型
     */
    public void test1(){
        School<Kid> school = new School<>();
    }

    @Test
    /**
     * 测试通配符泛型
     */
    public void test2(){
        CommonGeneric<Kid> commonGeneric = new CommonGeneric<>();
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("a");
        System.out.println(objects.size());
    }
}
