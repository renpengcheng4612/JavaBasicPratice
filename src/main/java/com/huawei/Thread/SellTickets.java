package com.huawei.Thread;

public class SellTickets extends Thread {

    // 共享数据
    static int count = 100;

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + "售出了一张票，剩余" + count);
        }
    }
}
