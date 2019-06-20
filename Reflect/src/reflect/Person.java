package reflect;

/**
 * Created by bitsino-001 on 2019/6/19.
 */
public class Person {
    private String name;
    protected int age;
    int weight;
    public String gender;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void goToSchool(){
        System.out.println("去上学");
    }
    protected void goToSchool1(){
        System.out.println("去上学1");
    }
     void goToSchool2(){
        System.out.println("去上学2");
    }
    public void goToSchoo3(){
        System.out.println("去上学3");
    }

}
