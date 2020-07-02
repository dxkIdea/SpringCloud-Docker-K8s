package com.dxk.springboot.testing.thread;

/**
 * @author 丁杏凯
 * @version 1.0
 * @description 类锁-Synchronized修饰静态方法
 * @date 2020/7/2 0002 15:19
 */
public class Synchronized3 implements Runnable{
    private static Synchronized3 instance1 = new Synchronized3();
    private static Synchronized3 instance2 = new Synchronized3();

    @Override
    public void run() {
        staticMethod();
    }

    /**
    * @Description: 类锁-synchronized修饰静态方法
    * @Author: 丁杏凯
    * @Date: 2020/7/2 0002 15:21
    */
    public static synchronized void staticMethod() {
        System.out.println("类锁-静态方法形式，线程名称：" + Thread.currentThread().getName() );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-运行结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finished");
    }
}
