package com.huawei.Sychronized;

public class LockUsageDemo01 {

    // 需求：100 张
    // 临界资源

    static int count = 100;

    // 任何对象都可以充当一个对象锁
    static String str = new String();
    static Runnable r = new Runnable() {
        @Override
        public void run() {

            while (count > 0) {
                synchronized (str) {
                    if (count <= 0) {
                        return;
                    }
                    count--;
                    System.out.println("售票员" + Thread.currentThread().getName() + "售出一张票，余额为" + count);
                }

            }
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(r, "喜洋洋");
        Thread t2 = new Thread(r, "沸羊羊");
        Thread t3 = new Thread(r, "灰太狼");
        Thread t4 = new Thread(r, "小灰灰");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    /*
     * 售票的过程中，出现负数的原因：
     *   1.当其中的一个线程抢到时间片进入到锁中，
     *   这时，其他剩余的三个线程都在while里面，但是在同步代码块外边，当最后一张票被售完以后，将自动解锁
     *   但是，其他剩余的三个线程将再次进入同步代码块进行强制售票，出现了负数，
     *   解决办法:在锁里面进行判断
     * */


}
