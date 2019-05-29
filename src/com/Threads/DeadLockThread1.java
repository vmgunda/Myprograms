package com.Threads;

public class DeadLockThread1 implements Runnable {


    Object lock1, lock2;

    public DeadLockThread1(Object lock1, Object lock2) {
        this.lock1=lock1;
        this.lock2=lock2;
    }

    @Override
    public void run() {

        synchronized (lock1) {
            System.out.println(" DeadLockThread1: holding lock1" );
            System.out.println(" DeadLockThread1: Waiting for lock2");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            synchronized (lock2) {
                System.out.println("DeadLockThread1: holding lock2");
            }
        }
    }
}
