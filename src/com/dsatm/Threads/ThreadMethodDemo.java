package com.dsatm.Threads;

public class ThreadMethodDemo {
    public static void main(String[] args) {
        childThread threadOne=new childThread(5,"First");
        childThread threadTwo=new childThread(10,"Second");
        threadOne.start();
        threadTwo.start();
        Thread.currentThread().setName("parent");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        System.out.println("Current Thread: " + Thread.currentThread());
        try {
            threadOne.join();//wait current thread until t1 is dead
            threadTwo.join(300);// wait current thread until t2 is dead or time period
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("----------- End of Main ------------");
    }
}

/* Hita's Code
public class ThreadMethodDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChildThread one=new ChildThread(5,"First");
        ChildThread two=new ChildThread(10,"Second");
        one.setPriority(Thread.MIN_PRIORITY);
        two.setPriority(Thread.MAX_PRIORITY);
        one.start();
        two.start();
        //Thread.currentThread().setName("Parent");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        System.out.println("Current thread "+ Thread.currentThread());

    }


}
*/