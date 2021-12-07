package com.huawei.TreadMethod;

public class DeamonFunctionDemo {

    /**
     * 后台线程：
     *    隐藏起来一直在默默运行的线程，直到进程结束，又被称为守护线程或精灵线程，JVM 的垃圾回收线程就是典型的后台线程。
     *    特征： 如果所有的前台线程都是死亡，后台线程会自动死亡，必须要在start 之前执行
     * */

    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        // 设置后台线程
        thread.setDaemon(true);
        thread.start();

        // 主线程的任务
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}






