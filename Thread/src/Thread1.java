import java.util.concurrent.*;

/**
 * 创建线程的两种方式
 * |-----继承Thread类，重新run方法，调用子类的start方法
 * |-----实现runnable接口，重写run方法，new Thread(runnable).start
 * |-----实现Callable接口配合FutureTask
 * |-----线程池创建线程
 */
@SuppressWarnings("all")
public class Thread1 {
    public static void main(String[] args) {
        /**
         * 继承Thread类新建线程
         */
        NewThread newThread = new NewThread();
        newThread.start();

        /**
         * 实现runnable接口新建线程
         */
        Thread thread = new Thread(new NewThread1());
        thread.start();

        /**
         * 匿名类的方式创建新线程
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程3");
            }
        }).start();

        /**
         * lambda表达式方式创建新线程
         */

        Runnable runnable = () -> System.out.println("线程4");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        /**
         * 实现Callable接口配合FutureTask创建新线程
         */
        NewThread2 callable = new NewThread2();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread2 = new Thread(futureTask);
        thread2.start();
        try {
            Integer num = futureTask.get();
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        /**
         * lambda表达式创建callable方式线程
         *
         */

        Callable<Integer> callable1 = () ->300 ;
        FutureTask<Integer> futureTask1 = new FutureTask<>(callable1);
        new Thread(futureTask1).start();
        try {
            Integer num1 = futureTask1.get();
            System.out.println(num1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        /**
         * 通过线程池方式创建
         * jdk5.0之后提供了创建线程池的方式
         */

        Runnable runnable1 = () -> System.out.println("线程池创建的线程");
        Callable<String> callable2 = () ->"110";
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(runnable1);
        Future<String> future = executorService.submit(callable2);
        try {
            String s = future.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}

class NewThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("线程1");
    }
}

class NewThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("线程2");
    }
}

class NewThread2 implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }
}