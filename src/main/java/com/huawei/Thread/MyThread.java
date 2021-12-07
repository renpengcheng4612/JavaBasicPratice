package com.huawei.Thread;

public class MyThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
        }
        // 这个方法的调用在哪个线程的线程执行体中，则指的是哪个当前正在执行的线程
        Thread thread = Thread.currentThread();
        System.out.println(thread);   // Thread[线程000,5,main]   Thread[线程的名字，线程的执行优先级，在哪个线程中创建的]
        System.out.println(thread.getName());
    }
}
