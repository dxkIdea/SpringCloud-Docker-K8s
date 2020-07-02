package com.dxk.springboot.testing.thread;

/**
 * @author 丁杏凯
 * @version 1.0
 * @description 线程测试类
 * @date 2020/7/1 0001 17:05
 */
public class TestThread implements Runnable{
    private static int count = 0;

    private void incr() {
        System.out.println(Thread.currentThread().getId() + "--------" + count);
        count ++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20000000; i++) {
            incr();
        }
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        Thread thread1 = new Thread(testThread);
        Thread thread2 = new Thread(testThread);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
