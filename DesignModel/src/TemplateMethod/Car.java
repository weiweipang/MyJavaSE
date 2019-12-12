package TemplateMethod;

/**
 * Created by bitsino-001 on 2019/6/20.
 * TemplateMethod:
 * 1、在公共父类中定义子类公有的属性，方法
 * 2、方法中包含普通方法和抽象方法（不同的子类进行不同的实现）
 *
 * 在Android中抽取BaseActivity时比较常用
 */
public abstract class Car {
    //汽车名称
    String name;

    public Car(String name) {
        this.name = name;
        run();
    }

    //所有的车都得跑，只是不同的车跑起来感觉不一样（个性的）定义成抽象的，强制子类实现
    protected abstract void run();

    //共性的，BBA的车都属于大众集团的
    protected void company(){
        System.out.println("BBA都是大众集团的");
    }
}
