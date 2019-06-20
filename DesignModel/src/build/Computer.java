package build;

/**
 * Created by bitsino-001 on 2019/6/18.
 */
public class Computer {
    private String cpu ; // cpu
    private String hardDisk ; //硬盘
    private String mainBoard ; // 主板
    private String memory ; // 内存

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public static class Builder{
        Computer computer = new Computer();
        public Builder installCpu(String cpu){
            computer.setCpu(cpu);
            return this;
        }
        public Builder installHardDisk(String hardDisk){
            computer.setHardDisk(hardDisk);
            return this;
        }
        public Builder installMainBoard(String mainBoard){
            computer.setMainBoard(mainBoard);
            return this;
        }
        public Builder installMemory(String memory){
            computer.setMemory(memory);
            return this;
        }
        public Computer build(){
            return computer;
        }
    }
}


