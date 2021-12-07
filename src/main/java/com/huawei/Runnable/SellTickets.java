package com.huawei.Runnable;

public class SellTickets implements Runnable {
    static int count = 100;
    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName()+"售出了一张票，剩余"+count);

        }
    }
}
