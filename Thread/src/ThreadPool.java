import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by bitsino-001 on 2019/6/18.
 * 线程池
 */
public class ThreadPool {
    public static void main(String[] args) {
        //创建具有固定线程数的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Runnable runnable = () -> System.out.println("任务1");
        executorService.submit(runnable);
        executorService.shutdown();
    }
}
