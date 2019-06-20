import org.junit.Test;
import reflect.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;

/**
 * Created by bitsino-001 on 2019/6/19.
 *
 */
public class ReflectTest {

    /**
     * 通过对象调用Object的getClass()获取Class
     */

    @Test
    public void test1(){
        Person person = new Person();
        Class clazz = person.getClass();
    }

    /**
     * 通过类的.class属性获得Class
     */
    @Test
    public void test2(){
        Class clazz = Person.class;

    }

    /**
     * 通过 Class.forName()静态方法传入要操作的类的全类名信息获得Class
     */
    @Test
    public void test3(){
        try {
            Class clazz = Class.forName("reflect.Person");
            //private修饰的属性无法通过getField直接获取
            //Field name = clazz.getField("name");
            //暴力获取方式
            Field name = clazz.getDeclaredField("name");
            //protected修饰的属性无法通过getField直接获取
            //Field age = clazz.getField("age");
            //默认修饰符修饰的属性无法通过getField直接获取
//            Field weight = clazz.getField("weight");
            Field gender = clazz.getField("gender");
            System.out.println(name);
//            System.out.println(age);
//            System.out.println(weight);
            System.out.println(gender);

            //获得Method的方式和Field类似,非public修饰的依旧需要通过暴力获取
//            Method goToSchool = clazz.getMethod("goToSchool", null);
            Method goToSchool = clazz.getDeclaredMethod("goToSchool", null);
            System.out.println(goToSchool);

            //通过反射获得类的全类名信息
            System.out.println(clazz.getName());

            //通过反射创建对象
            Person person = (Person) clazz.newInstance();
            System.out.println(person);



            ClassLoader classLoader = clazz.getClassLoader();
            //通过类加载器获取项目根目录
            String root = classLoader.getResource("").getPath();
            System.out.println(root);
            //通过类加载器获得指定文件路径
            URL resource = classLoader.getResource("reflect/test.txt");
            String path = resource.getPath();
            System.out.println(path);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
