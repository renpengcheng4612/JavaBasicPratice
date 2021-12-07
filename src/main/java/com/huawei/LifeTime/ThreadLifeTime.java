package com.huawei.LifeTime;

public class ThreadLifeTime {

    /*
     *  对于线程，当线程被创建并启动之后，它既不是一启动就进入了执行状态，也不是一直处于执行状态，在线程的生命周期中，他会经历各种不同的状态
     *  【在一个进程中，多个线程同时运行，是在争取CPU 时间片】
     * */
    public static void main(String[] args) {
        /*
         * Runnable (就绪) :但是还没有开始执行
         * Running (运行)： 抢到了时间片，CPU 开始处理这个线程中的任务
         * Blocked(阻塞)： 线程在执行过程中遇到特殊情况，使得其他线程就可以获得执行的机会，被阻塞的线程会等待合适的时机重新进入就绪状态
         * Dead(死亡)： 线程终止
         *     1. run 方法执行完成，线程正常结束（正常的死亡）
         *     2. 直接调用该线程的stop 方法强制终止这个线程
         * */
    }
}
