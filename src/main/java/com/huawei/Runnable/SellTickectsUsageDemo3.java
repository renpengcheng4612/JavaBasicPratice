package com.huawei.Runnable;

public class SellTickectsUsageDemo3 {

    public static void main(String[] args) {

        SellTickets s = new SellTickets();

        Thread s1 = new Thread(s);
        Thread s2 = new Thread(s);
        Thread s3 = new Thread(s);
        Thread s4 = new Thread(s);

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }

    /*
     * 两种实现方式的比较：
     *  1.实现Runnable 接口的方式：
     *    1.线程类只是实现了 Runnable 接口，还可以继承其他接口 （一个类在实现接口的同时还可以继承另外一个类）
     *    2.可以多个线程共享同一个target 对象，所以非常适合多个线程 来处理 同一份资源的情况
     *    3.弊端：编程稍微复杂，不直观，如果要访问当前线程，必须使用 Thread.currentThread()
     *
     *  继承Thread 类的方式
     *   1.编写简单，如果要访问当前线程，除了可以通过Thread.currentThread() 方式之外，还可以使用super关键字
     *   2.弊端：因为线程类已经继承了Thread类，则不能再继承其他类（单继承）
     *
     *   实际上大多数的多线程应用都可以采用 Runable 接口的方式来实现  【推荐使用匿名内部类】
     *
     *
     * 调用 start() 与run() 方法的区别
     *   当调用 start() 方法是将创建新的线程，并且执行run() 方法里的代码，但是如果直接调用 run（） 方法，不会创建新的线程也不会执行嗲用线程的代码
     * */


}
