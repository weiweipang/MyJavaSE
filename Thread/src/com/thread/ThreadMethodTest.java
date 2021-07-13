package com.thread;

/**
 * Thread类的常用方法的测试
 * 1.run():Thread的子类一定要重写的方法。将此分线程要执行的操作，声明在run()中
 * 2.start():要想启动一个分线程，就需要调用start():①启动线程②调用线程的run()
 * 3.currentThread():静态方法，获取当前的线程
 * 4.getName():获取当前线程的名字
 * 5.setName(String name)：设置当前线程的名字
 * 6.yield():当前线程调用此方法，释放CPU的执行权
 * 7.join():在线程a中调用线程b的join()方法:只有当线程b执行结束以后，线程a结束阻塞状态，继续执行。
 * 8.sleep(long millitimes):让当前的线程睡眠millitimes毫秒
 * 9.isAlive():判断当前线程是否存活
 * 
 * 10.线程的优先级：
 * 		MAX_PRIORITY：10
 * 		NORM_PRIORITY：5 ---默认优先级
 * 		MIN_PRIORITY：1
 * 
 *   设置优先级：setPriority(int priority); 
 *   获取优先级：getPriority();
 *   
 *   设置优先级以后，对高优先级，使用优先调度的抢占式策略，抢占低优先级的执行。但是并不意味着高优先级的线程一定先于低
 *   优先级的线程执行，而是从概率上来讲，概率更大而已。
 * 
 * 
 * 线程通信：wait() / notify() / notifyAll()  ---->java.lang.Object类中定义的方法
 * 
 */
class NumberThread extends Thread{
	 public void run() {

	 }
}



public class ThreadMethodTest {
	public static void main(String[] args) {
		NumberThread t1 = new NumberThread();

		//getName():获取当前线程的名字
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("新线程");

		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

		System.out.println(Thread.currentThread().getPriority());

		System.out.println(Thread.currentThread().isAlive());

		t1.start();

		System.out.println(t1.getName());
		System.out.println(t1.getPriority());


	}
}
