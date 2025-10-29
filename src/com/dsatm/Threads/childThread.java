package com.dsatm.Threads;

public class childThread  extends Thread{
    private int n;
    private String msg;

    public childThread(int n, String msg) {
        this.n = n;
        this.msg = msg;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(msg+i+" "+Thread.currentThread().getName());
            // the above method Thread.currentThread().getName() is used to get which method currently running
        }
    }
}
