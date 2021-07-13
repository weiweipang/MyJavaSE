package com.inner;

/**
 * Created by bitsino-001 on 2019/6/17.
 * 内部类：存在于一个类的内部的类称为内部类
 * 分类：
 *     1.成员内部类:可以访问外部类的所有成员，包括private修饰的，成员内部类中不能包含static修饰的成员
 *     2.静态成员内部类
 *     3.局部内部类
 *     4.匿名内部类
 *
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建成员内部类的对象
        School school = new School();
        School.StudentB studentB = school.new StudentB();
        studentB.showName();
        School.StudentC studentC = school.new StudentC();
        studentC.showName();
        School.StudentD studentD = school.new StudentD();
        studentD.showName();

        School.TeacherB teacherB = new School.TeacherB();
        teacherB.showName();

    }


}

/**
 * 举例将学校做为外部类，包含在其中的学生，老师等作为内部类
 */
class School{

    private String name="学校";
    protected String address="校区";
    int area = 100;
    public String work_time = "8点";
    /**
     * 成员内部类（private修饰，无法访问）
     */
    private class StudentA{
        private String name="学生A";
        private void showName(){
            System.out.println(name);
        }
    }
    /**
     * 成员内部类（protect修饰）
     */
    protected class StudentB{
        protected String name="学生B";
        private String name1="学生B1";
        protected void showName(){
            System.out.println(name);
            System.out.println(name);
            System.out.println(address);
            System.out.println(area);
            System.out.println(work_time);
        }
        private void showName1(){
            System.out.println(name1);
        }
    }
    /**
     * 成员内部类
     */
    class StudentC{
        protected String name="学生C";
        private String name1="学生C1";
        protected void showName(){
            System.out.println(name);
            System.out.println(name);
            System.out.println(address);
            System.out.println(area);
            System.out.println(work_time);

        }
        private void showName1(){
            System.out.println(name1);
        }
    }
    /**
     * 成员内部类(public修饰)
     */
    public class StudentD{
        protected String name="学生D";
        private String name1="学生D1";
        protected void showName(){
            System.out.println(name);
            System.out.println(name);
            System.out.println(address);
            System.out.println(area);
            System.out.println(work_time);
        }
        private void showName1(){
            System.out.println(name1);
        }
    }


    /**
     * 静态成员内部类
     */
    private static class TeacherA{

        String name="老师A";
        private void showName(){
            System.out.println(name);
        }
    }
    protected static class TeacherB{
        static int age;
        String name="老师B";
        protected void showName(){
            System.out.println(name);
        }
    }


    /**
     * 方法中的类称为局部内部类
     * 局部内部类不能包含权限修饰符
     */
    public void desc(){

        class Desc{

        }
    }

}