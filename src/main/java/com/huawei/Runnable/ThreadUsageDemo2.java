package com.huawei.Runnable;

public class ThreadUsageDemo2 {

    public static void main(String[] args) {
        //并不是线程对象
        Check c = new Check();
        /**
         * Thread(Runnable target)
         * 分配新的Thread 对象
         * */
        Thread t0 = new Thread(c);
        t0.start();

        Thread t1 = new Thread(c);
        t1.start();
    }
}
