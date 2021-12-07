package com.huawei.TreadMethod;

public class ThreadFunctionDemo01 {

    static Runnable r = new Runnable() {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "在执行");

                // 设置线程休眠
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    };


    public static void main(String[] args) {

        Thread t1 = new Thread(r);
        t1.setName("线程0000");
        t1.setPriority(10);

        Thread t2 = new Thread(r);
        t2.setName("线程11111");
        t2.setPriority(3);

        t1.start();
        t2.start();
    }


    /*
     *   可以通过设置线程的优先级来改变线程抢到时间片的概率，优先级高的线程获得较多的执行机会‘
     *   默认情况下，每个线程的优先级都与创建它的父线程 具有相同的优先级  ，例如： main 线程具有普通的优先级，则由main
     *
     *  注意：
     *  所传的参数范围1-10，默认为5 ，对应的数组越大，说明优先级越高，这个方法的设置一定要在start之前
     *  线程的优先级低并不意味着争抢不到时间片，只是抢到时间片的概率比较低而已
     *
     * */


}
