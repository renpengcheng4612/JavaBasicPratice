package com.huawei.Thread;

public class ThreadUsageDemo01 {

    public static void main(String[] args) {

        //实际子线程
        MyThread t0 = new MyThread();
        t0.setName("线程000");
        t0.start();


        MyThread t1 = new MyThread();
        t1.setName("线程111");
        t1.start();


        System.out.println("=========================================");
        // 这个方法的调用在哪个线程的线程执行体中，则指的是哪个当前正在执行的线程
        Thread thread = Thread.currentThread();
        System.out.println(thread);  //Thread[main,5,main]

        System.out.println(thread.getName());  // main

        // 设置线程的名字
        thread.setName("主线程");
        System.out.println(thread.getName());  // 主线程



    }

}
