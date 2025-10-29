package com.dsatm.Threads;

public class ThreadDemo {
    public static void main(String[] args) {
        childThread obj = new childThread(5, "Hello");
        childThread obj1 = new childThread(4, "Kiran");// we cn create multiple objects/instance for same class
        obj.start();
        obj1.start();
        //obj.run();// Even if we dont call run method automaticlly JVM calls run() method by default because thread class default having run() method
        System.out.println("------------------ End of Main -------------------");
    }
}
