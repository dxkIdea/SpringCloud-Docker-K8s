package com.dxk.springboot.testing.thread;

/**
 * @author 丁杏凯
 * @version 1.0
 * @description Synchronized对象锁-2
 * @date 2020/7/2 0002 15:12
 * 对象锁-方法修饰符形式
 */
public class Synchronized2 implements Runnable{
    private static Synchronized2 instance = new Synchronized2();

    @Override
    public void run() {
       method();
    }

    /**
    * @Description: 对象锁-方法修饰符形式，锁对象默认是this
    * @Author: 丁杏凯
    * @Date: 2020/7/2 0002 15:15
    */
    public synchronized void method() {
        System.out.println("对象锁-方法修饰符形式，线程名称：" + Thread.currentThread().getName() );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "-运行结束");

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println("finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
