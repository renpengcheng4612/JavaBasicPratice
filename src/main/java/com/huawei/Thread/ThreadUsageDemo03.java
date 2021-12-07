package com.huawei.Thread;

public class ThreadUsageDemo03 {

    public static void main(String[] args) {

        // 需求：模拟4个售票员售100张票
        SellTickets s1 = new SellTickets();
        SellTickets s2 = new SellTickets();
        SellTickets s3 = new SellTickets();
        SellTickets s4 = new SellTickets();


        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }

}
