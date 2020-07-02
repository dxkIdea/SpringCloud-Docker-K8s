package com.dxk.springboot.testing.thread;

/**
 * @author 丁杏凯
 * @version 1.0
 * @description synchronized对象锁-1
 * @date 2020/7/2 0002 14:46
 * 对象锁-代码块形式，手动指定锁对象，this/自定义锁
 * synchronized锁对象，this/自定义锁，如果同步代码块使用锁相同，则串行；如果锁不一致，则并行；
 */
public class Synchronized1 implements Runnable{
    private static Synchronized1 instance = new Synchronized1();

    //锁对象
    Object lock1 = new Object();
    Object lock2 = new Object();

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("对象锁代码块形式，线程名称：" + Thread.currentThread().getName() + "-lock1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-lock1-运行结束");
        }

        /*synchronized (lock2) {
            System.out.println("对象锁代码块形式，线程名称：" + Thread.currentThread().getName() + "lock2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-lock2-运行结束");
        }*/
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
