package com.huawei.TreadMethod;

public class YieldFunctionDemo01 {

    public static void main(String[] args) {
        YieldThread t0=new YieldThread("线程0000");
      //  t0.setPriority(8);
        t0.start();

        YieldThread t1=new YieldThread("线程1111");
        t1.start();
    }


    static class YieldThread extends Thread {
        public YieldThread() {
        }

        public YieldThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

                if (i == 20) {
                    // 线程让步，不会让线程进入阻塞状态
                    Thread.yield();
                }

            }
        }
    }
}
