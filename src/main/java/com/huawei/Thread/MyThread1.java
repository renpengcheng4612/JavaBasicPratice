package com.huawei.Thread;

public class MyThread1 extends Thread {

    public MyThread1() { }

    public MyThread1(String name){
        super(name);   // 调用父类中的Thread(String name)
    }

    @Override
    public void run() {
        System.out.println(currentThread().getName());
        super.run();
    }
}
