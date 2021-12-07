package com.huawei.TreadMethod;

public class JoinFuctionDemo01 {

    public static void main(String[] args) throws InterruptedException {

        /*
         *  在执行原来的线程的过程中，如果遇到了合并线程，则优先执行合并进来的线程，执行完合并进来的线程后，在回到原来的任务中，继续执行原来的线程。
         *
         *   特点：
         *    1.线程合并，当前线程一定会释放cpu 时间片，cpu 会将时间片分给要 join 的线程
         *    2. 哪个线程需要合并就在当前线程中，添加要合并的线程
         *    3.join 之前，一定要将线程处于准备状态start
         *
         *
         * */

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if (i == 20) {
                MyThread myThread = new MyThread("myThread");
                myThread.start();  // join 之前，一定要将线程处于准备 状态 start
                myThread.join();
            }
        }
    }

}
