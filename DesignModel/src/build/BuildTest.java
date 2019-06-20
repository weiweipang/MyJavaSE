package build;

/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class BuildTest {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();
       Computer computer =  builder
                            .installCpu("因特尔")
                            .installHardDisk("希捷")
                            .installMainBoard("罗技")
                            .installMemory("海盗船")
                            .build();

        System.out.println(computer);
    }
}
