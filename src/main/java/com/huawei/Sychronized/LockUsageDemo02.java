package com.huawei.Sychronized;

public class LockUsageDemo02 {

    // 需求：100 张
    // 临界资源
    static int count = 100;

    static Runnable r = new Runnable() {

        @Override
        public void run() {
            while (count > 0) {
                // 同步代码块结合类锁
                // LockUsageDemo03.class
                // 任何类，包含自定义的类都可以充当一把类锁
                synchronized (Math.class) {
                    if (count <= 0) {
                        return;
                    }
                    count--;
                    System.out.println("");
                }

            }


        }
    };


}
